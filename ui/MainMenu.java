package ui;

import ui.commands.mainMenu.*;

import java.util.ArrayList;

public class MainMenu extends Menu{
    private ViewMainMenu viewMainMenu;

    public MainMenu(ViewMainMenu viewMainMenu){
        this.viewMainMenu = viewMainMenu;
        commandList = new ArrayList<>();
        commandList.add(new AddRegistry(viewMainMenu));
        commandList.add(new ReadRegistry(viewMainMenu));
        commandList.add(new WriteRegistry(viewMainMenu));
        commandList.add(new WorkWithRegistry(viewMainMenu));
        commandList.add(new Finish(viewMainMenu));
    }
}
