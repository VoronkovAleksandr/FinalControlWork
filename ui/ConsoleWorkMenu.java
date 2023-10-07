package ui;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConsoleWorkMenu extends ConsoleMenu implements ViewWorkMenu{

    private WorkMenu workMenu;

    public ConsoleWorkMenu(){
        scanner = new Scanner(System.in);
        start = true;
        workMenu = new WorkMenu(this);
    }

    @Override
    public void start() {
        while (start){
            printMenu();
            execute();
        }
    }
    private int getAnimalId() {
        int id;
        while (true){
            String text = scanner.nextLine();
            if (checkTextForInt(text)) {
                id = Integer.parseInt(text);
                return id;
            } else {
                inputError();
            }
        }
    }

    @Override
    public void addCat() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addCat(name, date);
    }

    @Override
    public void addDog() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addDog(name, date);
    }

    @Override
    public void addHamster() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addHamster(name, date);
    }

    @Override
    public void addHorse() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addHorse(name, date);
    }

    @Override
    public void addCamel() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addCamel(name, date);
    }

    @Override
    public void addDonkey() {
        String name = getString("Введите кличку животного:");
        Date date = getDateFromScanner("Введите дату рождения:");
        presenter.addDonkey(name, date);
    }

    @Override
    public void teachAnimal() {
        String idStr = getString("Введите ID животного для обучения");
        if (checkTextForInt(idStr)){
            int id = Integer.parseInt(idStr);
            try {
                String animal = presenter.findAnimalById(id);
                System.out.println("Будем обучать:\n" + animal);
                String command = getString("Введите команду:");
                presenter.teachAnimal(id, command);
            } catch (Exception e){
                System.out.println("Такого животного нет в реестре");
            }
        } else {
            inputError();
        }

    }

    @Override
    public void findAnimalById() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)){
            int id = Integer.parseInt(line);
            try {
                System.out.println(presenter.findAnimalById(id));
            } catch (Exception e){
                    System.out.println("Такого животного нет в реестре");
            }
        } else {
            inputError();
        }
    }

    @Override
    public void findAnimal() {
        System.out.println("Найти животное:");
        String name = getString("Введите имя");
        Date date = getDateFromScanner("Введите дату рождения");
        try {
            System.out.println(presenter.findAnimal(name, date));
        } catch (Exception e){
            System.out.println("Такого животного нет в реестре");
        }
    }

    @Override
    public void printRegistry() {
        presenter.getAnimal();
    }


    public void printMenu() {
        System.out.println(workMenu.print());
    }

    public void execute() {
        String input = scanner.nextLine();
        if (checkTextForInt(input)){
            int numCommand = Integer.parseInt(input);
            if (checkCommand(numCommand, workMenu)){
                workMenu.execute(numCommand);
            }
        }
    }
    private Date getDateFromScanner(String message){
        System.out.println(message);
        while (true) {
            String dateStr = scanner.nextLine();
            try {
                SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
                Date date = format.parse(dateStr);
                return date;
            } catch (ParseException e) {
                System.out.println("Ошибка при вводе даты.\n" +
                        "Введите дату в фомате ДД.ММ.ГГГГ");
            }
        }
    }
    private String getString(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

}
