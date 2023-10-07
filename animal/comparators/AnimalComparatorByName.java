package animal.comparators;

import registry.RegistryItem;

import java.util.Comparator;

public class AnimalComparatorByName<T extends RegistryItem> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
