package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class TeachAnimal implements Command {
    private ViewWorkMenu viewWorkMenu;

    public TeachAnimal(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Обучить животное новой команде";
    }

    @Override
    public void execute() {
        viewWorkMenu.teachAnimal();
    }
}
