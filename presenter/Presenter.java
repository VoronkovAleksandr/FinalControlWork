package presenter;

import animal.Animal;
import service.Service;
import ui.View;

import java.util.Date;

public class Presenter {
    private View viewMainMenu;
    private Service service;

    public Presenter(View viewMainMenu, Service service){
        this.viewMainMenu = viewMainMenu;
        this.service = service;
        viewMainMenu.setPresenter(this);
    }

    public void addCat(String name, Date birthday){
        service.addCat(name, birthday);
    }
    public void addDog(String name, Date birthday){
        service.addDog(name, birthday);
    }
    public void addHamster(String name, Date birthday){
        service.addHamster(name, birthday);
    }
    public void addHorse(String name, Date birthday){
        service.addHorse(name, birthday);
    }
    public void addCamel(String name, Date birthday){
        service.addCamel(name, birthday);
    }
    public void addDonkey(String name, Date birthday){
        service.addDonkey(name, birthday);
    }

    public void getAnimal(){
        viewMainMenu.print(service.getStringAnimals());
    }

    public void readRegistry(String fileName) throws Exception {
        service.readRegistryFromFile(fileName);
    }

    public void writeRegistry(String family) throws Exception {
        service.writeRegistryToFile(family);
    }

    public String findAnimalById(int id){
        return service
                .getAnimalById(id)
                .toString();
    }

    public String findAnimal(String name,Date birthday){
        return service
                .getAnimal(name, birthday)
                .toString();
    }

    public void teachAnimal(int id, String command) {
        Animal animal = service.getAnimalById(id);
        animal.addCommand(command);
    }
}
