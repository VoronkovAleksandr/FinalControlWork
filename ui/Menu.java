package ui;

import ui.commands.Command;

import java.util.List;

public abstract class Menu {
    List<Command> commandList;


    public String print(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < commandList.size(); i++){
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public void execute(int numCommand){
        commandList.get(numCommand-1).execute();
    }

    public int size(){
        return commandList.size();
    }
}
