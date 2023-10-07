package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddHamster implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddHamster(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить хомячка";
    }

    @Override
    public void execute() {
        viewWorkMenu.addHamster();
    }
}
