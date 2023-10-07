package animal;

import java.util.Date;

public class Dog extends Pets{
    public Dog(int id, String name, Date birthday) {
        super(id, name, birthday, "Собаки");
    }
}
