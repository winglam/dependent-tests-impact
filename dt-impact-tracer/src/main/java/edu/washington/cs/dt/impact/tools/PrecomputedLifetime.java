package edu.washington.cs.dt.impact.tools;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.functional.Func;
import com.reedoei.eunomia.math.Averager;
import com.reedoei.eunomia.util.DateUtil;
import com.reedoei.eunomia.util.StandardMain;
import com.reedoei.eunomia.util.Util;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResults;
import edu.washington.cs.dt.impact.figure.generator.EnhancedResultsFigureGenerator;
import edu.washington.cs.dt.impact.util.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class PrecomputedLifetime extends StandardMain {
    private List<Integer> versionDays = new ArrayList<>();

    private PrecomputedLifetime(final String[] args) {
        super(args);
    }

    public static void main(final String[] args) throws Exception {
        new PrecomputedLifetime(args).run();
    }

    private Date dateFromDir(final Path path) {
        final String dirName = path.getFileName().toString();
        final List<String> parts = ListUtil.fromArray(dirName.split("-"));
        // Folders are in format: subj-name-yyyy-mm-dd-H-M-S-commit so we want just the date part.
        final List<Integer> dateParts = Func.map(Integer::parseInt, parts.subList(parts.size() - 7, parts.size() - 1));

        return DateUtil.makeDate(dateParts.get(0), dateParts.get(1), dateParts.get(2), dateParts.get(3), dateParts.get(4), dateParts.get(5));
    }

    @Override
    protected void run() throws Exception {
        final Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(getArgRequired("start-date"));

        versionDays = new ArrayList<>();

        final EnhancedResultManager manager = new EnhancedResultManager();

        final Path resultPaths = Paths.get(getArgRequired("paths"));
        Files.list(resultPaths).forEach(path -> {
            versionDays.add(Math.toIntExact(Duration.between(startDate.toInstant(), dateFromDir(path).toInstant()).toDays()));
            try {
                manager.add(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        final Averager<Integer> averager = new Averager<>();
        for (final Constants.TECHNIQUE technique : Constants.TECHNIQUE.values()) {
            manager.retrieve("orig", technique).ifPresent(e -> averager.addAll(lifetimes(e)));
        }

        System.out.println();
        System.out.println((int)averager.mean());
    }

    private List<Integer> lifetimes(EnhancedResultAverager e) {
        return e.getAveragers().stream()
                    .map(Averager::getValues)
                    // Get the number of values until it's less than 0. -1 because it's an index.
                    .map(values -> ListUtil.takeWhile(v -> v > 0, values).size() - 1)
                    .map(i -> i < 0 ? 0 : versionDays.get(i))
                    .collect(Collectors.toList());
    }
}
