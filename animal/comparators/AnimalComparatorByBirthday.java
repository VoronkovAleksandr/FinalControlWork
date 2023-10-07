package animal.comparators;

import registry.RegistryItem;

import java.util.Comparator;
import java.util.Date;

public class AnimalComparatorByBirthday<T extends RegistryItem> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
