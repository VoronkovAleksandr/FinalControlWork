package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddDog implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddDog(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить собаку";
    }

    @Override
    public void execute() {
        viewWorkMenu.addDog();
    }
}
