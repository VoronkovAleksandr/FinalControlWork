package ui.commands.mainMenu;

import ui.ViewMainMenu;
import ui.commands.Command;

public class WriteRegistry implements Command {
    private ViewMainMenu viewMainMenu;

    public WriteRegistry(ViewMainMenu viewMainMenu){
        this.viewMainMenu = viewMainMenu;
    }

    @Override
    public String getDescription() {
        return "Сохранить реестр.";
    }

    @Override
    public void execute() {
        viewMainMenu.writeFamilyTree();
    }
}