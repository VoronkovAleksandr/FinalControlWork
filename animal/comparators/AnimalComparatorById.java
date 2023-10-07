package animal.comparators;

import registry.RegistryItem;

import java.util.Comparator;

public class AnimalComparatorById<T extends RegistryItem> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
