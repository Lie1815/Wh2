package AnimalPlay;


interface Command{
    void execute();
}

public class StartFoxic implements Command {

    public void execute() {
        System.out.println("Игра началась! ");
    }
}

class LoadFoxic implements Command{

    public void execute() {
        System.out.println("Загрузка игры.....");
    }
}

class ExitFoxic implements Command{

    public void execute() {
        System.out.println("Выход из игры. До свидания!");
        System.exit(0);
    }
}

class SaveFoxic implements Command{

    public void execute() {
        System.out.println("Игра сохранена.");
    }
}

