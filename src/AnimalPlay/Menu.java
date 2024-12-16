package AnimalPlay;

import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class Menu {
    private final List<Command> commands = new LinkedList<>();
    private boolean inGame = false;

    public void display(){
        while (true){
            System.out.println("Выберите пункт меню: ");
            System.out.println("0 - Выйти ");
            System.out.println("1 - Начать игру ");
            System.out.println("2 - Загрузить игру ");


            for( int i = 0; i < commands.size(); i++){
                System.out.println((i + 1 ) + " - " + commands.get(i).getClass().getSimpleName().replace("Команда", ""));

            }
            if (inGame){
                System.out.println((commands.size() + 1) + "- Сохранить игру");

            }
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if (choice == 0 ){
                break;
            }
            else if (choice > 0 && choice <= commands.size()){
                commands.get(choice - 1).execute();
            if (choice == 1 ){
                inGame = true;

            } else if (inGame && choice == commands.size() + 1 ) {
                new SaveFoxic().execute();
            } else {
                System.out.println("некоректный выбор. Попробуйте еще раз");
               }
            }
        }
    }
}
