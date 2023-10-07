import presenter.Presenter;
import service.Service;
import ui.ConsoleMainMenu;
import ui.View;


public class Main {

    public static void main(String[] args) {
        View viewMainMenu = new ConsoleMainMenu();
        Service service = new Service();
        new Presenter(viewMainMenu, service);
        viewMainMenu.start();


    }
}
