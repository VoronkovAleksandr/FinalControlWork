package registry;


import java.util.ArrayList;
import java.util.Date;

public interface RegistryItem {

    int getId();
    String getName();
    Date getBirthday();
    ArrayList<String> getCommands();
}
