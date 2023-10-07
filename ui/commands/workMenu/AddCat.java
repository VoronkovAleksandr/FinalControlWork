package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddCat implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddCat(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить кота";
    }

    @Override
    public void execute() {
        viewWorkMenu.addCat();
    }
}
