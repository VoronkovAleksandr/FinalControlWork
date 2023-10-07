package registry;

import animal.comparators.AnimalComparatorByName;
import animal.comparators.AnimalComparatorById;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Registry<E extends RegistryItem> implements Serializable, Iterable<E> {
    private List<E> animals = new ArrayList<>();

    public void addAnimal(E animal){
        this.animals.add(animal);
    }

    public E getAnimal(String name, Date birthday){
        for (E animal: animals
        ) {
            if (animal.getName().equals(name) &&
                    animal.getBirthday().equals(birthday)){
                return animal;
            }
        }
        return null;
    }

    public E getAnimalById(int id){
        for (E animal: animals) {
            if (animal.getId() == (id)){
                return animal;
            }
        }
        return null;
    }

    public String getStringAnimals(){
        StringBuilder sb = new StringBuilder();
        for (E animal: this.animals) {
            sb.append(animal.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<E> getAnimals(){
        return this.animals;
    }
    public void setAnimals(List<E> readData){
        animals = readData;
    }

    @Override
    public Iterator<E> iterator() {
        return animals.iterator();
    }
    public void sortByName(){
        animals.sort(new AnimalComparatorByName());
    }
    public void sortById(){
        animals.sort(new AnimalComparatorById());
    }

    public int getLastId() {
        int currentId;
        int maxId = 0;
        for (E animals: animals) {
            currentId = animals.getId();
            if (currentId > maxId){
                maxId = currentId;
            }
        }
        return maxId;
    }
}
