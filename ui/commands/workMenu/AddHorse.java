package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddHorse implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddHorse(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить лошадь";
    }

    @Override
    public void execute() {
        viewWorkMenu.addHorse();
    }
}
