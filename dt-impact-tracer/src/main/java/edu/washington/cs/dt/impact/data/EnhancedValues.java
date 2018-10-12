package edu.washington.cs.dt.impact.data;

import java.util.function.Supplier;

public class EnhancedValues<T> {
    private final T unenhanced;
    private final T enhanced;

    public EnhancedValues(final T unenhanced, final T enhanced) {
        this.unenhanced = unenhanced;
        this.enhanced = enhanced;
    }

    public EnhancedValues(final Supplier<T> supplier) {
        unenhanced = supplier.get();
        enhanced = supplier.get();
    }

    public T get(final boolean unen) {
        if (unen) {
            return unenhanced();
        } else {
            return enhanced();
        }
    }

    public T enhanced() {
        return enhanced;
    }

    public T unenhanced() {
        return unenhanced;
    }
}
