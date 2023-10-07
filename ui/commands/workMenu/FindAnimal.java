package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class FindAnimal implements Command {
    private ViewWorkMenu viewWorkMenu;

    public FindAnimal(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Найти животное";
    }

    @Override
    public void execute() {
        viewWorkMenu.findAnimal();
    }
}
