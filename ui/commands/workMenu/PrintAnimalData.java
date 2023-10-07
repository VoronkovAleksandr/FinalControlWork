package ui.commands.workMenu;

import ui.ViewWorkMenu;
import ui.commands.Command;

public class PrintAnimalData implements Command {
    private ViewWorkMenu viewWorkMenu;
    public PrintAnimalData(ViewWorkMenu viewWorkMenu){
        this.viewWorkMenu = viewWorkMenu;
    }
    @Override
    public String getDescription() {
        return "Вывести данные о животных";
    }
    @Override
    public void execute() {
        viewWorkMenu.printRegistry();
    }
}
