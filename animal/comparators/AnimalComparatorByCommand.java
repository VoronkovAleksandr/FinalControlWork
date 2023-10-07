package animal.comparators;

import registry.RegistryItem;

import java.util.Comparator;

public class AnimalComparatorByCommand<T extends RegistryItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        if (o1.getCommands().equals(o2.getCommands())){
            return 0;
        }
        return 1;
    }
}
