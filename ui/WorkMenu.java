package ui;

import ui.commands.workMenu.*;

import java.util.ArrayList;

public class WorkMenu extends Menu{
    private ViewWorkMenu viewWorkMenu;

    public WorkMenu(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
        commandList = new ArrayList<>();
        commandList.add(new AddCat(viewWorkMenu));
        commandList.add(new AddDog(viewWorkMenu));
        commandList.add(new AddHamster(viewWorkMenu));
        commandList.add(new AddHorse(viewWorkMenu));
        commandList.add(new AddCamel(viewWorkMenu));
        commandList.add(new AddDonkey(viewWorkMenu));
        commandList.add(new TeachAnimal(viewWorkMenu));

        commandList.add(new PrintAnimalData(viewWorkMenu));
        commandList.add(new FindAnimal(viewWorkMenu));
        commandList.add(new FindAnimalById(viewWorkMenu));
        commandList.add(new BackToMainMenu(viewWorkMenu));
    }
}
