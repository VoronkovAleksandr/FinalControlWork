package animal;

import registry.RegistryItem;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Animal implements Serializable, RegistryItem {
    private static final long serialVersionUID = -3053601393801798109L;
    private int id;
    private String name;
    private Date birthday;
    private String animalClass;
    private ArrayList<String> commands;

    public Animal(int id, String name, Date birthday, String animalClass, ArrayList<String> commands) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.animalClass = animalClass;
        this.commands = commands;
    }

    public Animal(int id, String name, Date birthday, String animalClass){
        this(id, name, birthday,animalClass, new ArrayList<String>());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    @Override
    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    public void addCommand(String command){
        this.commands.add(command);
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        return "Кличка: '" + name + '\'' +
                " id: " + id +
                ", День рождения: " + format.format(birthday) +
                ", Класс: " + animalClass + '\'' +
                ", Знает команды: " + commands + '\'';
    }
}
