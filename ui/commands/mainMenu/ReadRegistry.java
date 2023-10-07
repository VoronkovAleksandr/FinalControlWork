package ui.commands.mainMenu;

import ui.ViewMainMenu;
import ui.commands.Command;

public class ReadRegistry implements Command {
    private ViewMainMenu viewMainMenu;

    public ReadRegistry(ViewMainMenu viewMainMenu){
        this.viewMainMenu = viewMainMenu;
    }

    @Override
    public String getDescription() {
        return "Загрузить реестр.";
    }

    @Override
    public void execute() {
        viewMainMenu.readFamilyTree();
    }
}
