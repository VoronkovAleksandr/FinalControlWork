package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class FindAnimalById implements Command {
    private ViewWorkMenu viewWorkMenu;

    public FindAnimalById(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }

    @Override
    public String getDescription() {
        return "Найти животное по ID";
    }

    @Override
    public void execute() {
        viewWorkMenu.findAnimalById();
    }
}
