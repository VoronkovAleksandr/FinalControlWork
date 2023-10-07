package service;

import animal.*;
import registry.Registry;
import readWrite.ReadWriteData;
import readWrite.ReadWriteObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Service implements Serializable {
    private int id;
    private Registry<Animal> activeRegistry;
    private List<Registry> registryList;
    private ReadWriteData rw;

    public Service(Registry registry, ReadWriteData rw) {
        this.activeRegistry = registry;
        registryList = new ArrayList<>();
        this.rw = rw;
        registryList.add(registry);
    }

    public Service() {
        this(new Registry(), new ReadWriteObject());
    }

    public void writeRegistryToFile(String fileName) throws Exception {
        rw.writeData(activeRegistry.getAnimals(), fileName);
    }

    public void readRegistryFromFile(String fileName) throws Exception {
        activeRegistry.setAnimals(rw.readData(fileName));
        this.id = activeRegistry.getLastId();
    }

    public void addCat(String name, Date birthday) {
        activeRegistry.addAnimal(new Cat(++id, name, birthday));
    }

    public void addDog(String name, Date birthday) {
        activeRegistry.addAnimal(new Dog(++id, name, birthday));
    }

    public void addHamster(String name, Date birthday) {
        activeRegistry.addAnimal(new Hamster(++id, name, birthday));
    }

    public void addHorse(String name, Date birthday) {
        activeRegistry.addAnimal(new Horse(++id, name, birthday));
    }

    public void addCamel(String name, Date birthday) {
        activeRegistry.addAnimal(new Camel(++id, name, birthday));
    }

    public void addDonkey(String name, Date birthday) {
        activeRegistry.addAnimal(new Donkey(++id, name, birthday));
    }

    public Animal getAnimal(String name, Date birthday){
        return activeRegistry.getAnimal(name, birthday);
    }

    public String getStringAnimals(){
        return activeRegistry.getStringAnimals();
    }

    public List<Animal> getAnimals() {
        return activeRegistry.getAnimals();
    }

    public void sortByName() {
        activeRegistry.sortByName();
    }

    public void sortById() {
        activeRegistry.sortById();
    }

    public Animal getAnimalById(int id) {
        return activeRegistry.getAnimalById(id);
    }
}

