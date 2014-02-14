package edu.washington.cs.dt.impact.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileTools {

    public static void main(String[] args) {

        File f1 = new File(args[0]);
        List<String> f1Set = new LinkedList<String>();

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(f1));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }
                f1Set.add(line.trim());
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f2 = new File(args[1]);
        List<String> f2Set = new LinkedList<String>();

        try {
            br = new BufferedReader(new FileReader(f2));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 0) {
                    continue;
                }
                f2Set.add(line.trim());
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("starting...");
        for (String s : f1Set) {
            f2Set.remove(s);
        }

        for (String s : f2Set) {
            System.out.println(s);
        }
    }
}
