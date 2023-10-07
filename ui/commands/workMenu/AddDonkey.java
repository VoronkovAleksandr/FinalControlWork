package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddDonkey implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddDonkey(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить осла";
    }

    @Override
    public void execute() {
        viewWorkMenu.addDonkey();
    }
}
