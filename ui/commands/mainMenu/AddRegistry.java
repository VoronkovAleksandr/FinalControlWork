package ui.commands.mainMenu;

import ui.ViewMainMenu;
import ui.commands.Command;

public class AddRegistry implements Command {
    private ViewMainMenu viewMainMenu;

    public AddRegistry(ViewMainMenu viewMainMenu){
        this.viewMainMenu = viewMainMenu;
    }
    @Override
    public String getDescription() {
        return "Создать новый реестр.";
    }

    @Override
    public void execute() {
        viewMainMenu.addFamilyTree();
    }
}
