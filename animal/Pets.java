package animal;

import registry.RegistryItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public abstract class Pets extends Animal{

    public Pets(int id, String name, Date birthday, String animalClass) {
        super(id, name, birthday, animalClass);
    }
}
