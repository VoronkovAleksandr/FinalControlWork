package ui.commands.mainMenu;

import ui.ViewMainMenu;
import ui.commands.Command;

public class WorkWithRegistry implements Command {
    private ViewMainMenu viewMainMenu;
    public WorkWithRegistry(ViewMainMenu viewMainMenu){
        this.viewMainMenu = viewMainMenu;
    }
    @Override
    public String getDescription() {
        return "Работать с реестром";
    }

    @Override
    public void execute() {
        viewMainMenu.workWithTree();

    }
}
