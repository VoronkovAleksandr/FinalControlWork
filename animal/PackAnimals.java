package animal;

import java.util.ArrayList;
import java.util.Date;

public abstract class PackAnimals extends Animal{
        float capacity;

    public PackAnimals(int id, String name, Date birthday, String animalClass, ArrayList<String> commands, float capacity) {
        super(id, name, birthday, animalClass, commands);
        this.capacity = capacity;
    }

    public PackAnimals(int id, String name, Date birthday, String animalClass) {
        super(id, name, birthday, animalClass);
        this.capacity = 0;
    }
}

