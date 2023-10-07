package ui;

import presenter.Presenter;
import service.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ConsoleMainMenu extends ConsoleMenu implements ViewMainMenu{

    private MainMenu mainMenu;

    private String registry;

    ViewWorkMenu viewWorkMenu;

    public ConsoleMainMenu(){
        scanner = new Scanner(System.in);
        start = true;
        mainMenu = new MainMenu(this);
        this.registry = "";
    }


    @Override
    public void start() {
        hello();
        while (start){
            if (!registry.equals("")){
                System.out.println("Реестр: " + registry);
            }
            printMenu();
            execute();
        }
    }

    @Override
    public void addFamilyTree() {
        System.out.println("Создать новый реестр");
        System.out.println("Введите имя файла:");
        String fileName = scanner.nextLine();
        Path path = Path.of(fileName + ".txt");
        if (Files.exists(path)){
            System.out.println("Такой реестр уже существует.\n");
        } else {
            this.presenter = new Presenter(this, new Service());
            this.registry = fileName;
        }
    }

    @Override
    public void readFamilyTree() {
        System.out.println("Загрузить реестр");
        System.out.println("Введите имя файла:");
        String fileName = scanner.nextLine();
        try {
            System.out.println("До загрузки");
            presenter.readRegistry(fileName + ".txt");
            System.out.println("После загрузки");
            registry = fileName;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void writeFamilyTree() {
        if (!this.registry.equals("")) {
            System.out.println("Сохранить реестр");
            try {
                presenter.writeRegistry(this.registry + ".txt");
                System.out.println("Данные записаны в файл " + this.registry + ".txt");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Сначала надо создать реестр.\n");
        }
    }

    @Override
    public void workWithTree() {
        if (!this.registry.equals("")) {
            viewWorkMenu = new ConsoleWorkMenu();
            viewWorkMenu.setPresenter(presenter);
            viewWorkMenu.start();
        } else {
            System.out.println("Сначала надо создать или загрузить реестр.\n");
        }
    }

    @Override
    public void finish() {
        System.out.println("Пока!");
        start = false;
    }

    private void hello(){
        System.out.println("Добро пожаловать!");
    }

    public void printMenu(){
        System.out.println(mainMenu.print());
    }

    public void execute(){
        String input = scanner.nextLine();
        if (checkTextForInt(input)){
            int numCommand = Integer.parseInt(input);
            if (checkCommand(numCommand,mainMenu)){
                mainMenu.execute(numCommand);
            }
        }
    }

}
