package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class AddCamel implements Command {
    private ViewWorkMenu viewWorkMenu;

    public AddCamel(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Добавить верблюда";
    }

    @Override
    public void execute() {
        viewWorkMenu.addCamel();
    }
}
