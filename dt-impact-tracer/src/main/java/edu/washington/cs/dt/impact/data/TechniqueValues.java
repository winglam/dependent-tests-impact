package edu.washington.cs.dt.impact.data;

import com.reedoei.eunomia.collections.ListUtil;
import com.reedoei.eunomia.collections.PairStream;
import edu.washington.cs.dt.impact.util.Constants;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TechniqueValues<T> {
    private final T prio;
    private final T sele;
    private final T para;

    public TechniqueValues(final T prio, final T sele, final T para) {
        this.prio = prio;
        this.sele = sele;
        this.para = para;
    }

    public TechniqueValues(final Supplier<T> supplier) {
        this.prio = supplier.get();
        this.sele = supplier.get();
        this.para = supplier.get();
    }

    public T technique(final Constants.TECHNIQUE technique) {
        switch (technique) {
            case PRIORITIZATION:
                return prio();
            case SELECTION:
                return sele();
            case PARALLELIZATION:
                return para();
        }

        // Unreachable
        return prio();
    }

    public T prio() {
        return prio;
    }

    public T sele() {
        return sele;
    }

    public T para() {
        return para;
    }

    public void forEach(final BiConsumer<Constants.TECHNIQUE, T> consumer) {
        stream().forEach(consumer);
    }

    public PairStream<Constants.TECHNIQUE, T> stream() {
        return PairStream.zip(
                ListUtil.fromArray(Constants.TECHNIQUE.values()),
                ListUtil.fromArray(prio(), sele(), para()));
    }

    public <U> TechniqueValues<U> fmap(final Function<T, U> f) {
        return new TechniqueValues<>(f.apply(prio()), f.apply(sele()), f.apply(para()));
    }
}
