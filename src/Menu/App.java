package Menu;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;



public class App extends Task{

    public App(String title, LocalDate date, String discription) {
        super(title, date, discription);
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (true) {
            System.out.println("Выберите опцию:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Просмотреть задачи на сегодня");
            System.out.println("3. Просмотреть задачи на определенный день");
            System.out.println("4. Просмотреть задачи за неделю");
            System.out.println("5. Посмотреть последние 5 задач ");
            System.out.println("6. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите дату задачи (yyyy-MM-dd): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(new Task(title, date, description));
                    break;

                case 2:
                    LocalDate today = LocalDate.now();
                    System.out.println("Задачи на сегодня:");
                    taskManager.displayTasks(taskManager.getTasksForDate(today));
                    break;

                case 3:
                    System.out.print("Введите дату для просмотра задач (yyyy-MM-dd): ");
                    LocalDate specificDate = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.println("Задачи на " + specificDate + ":");
                    taskManager.displayTasks(taskManager.getTasksForDate(specificDate));
                    break;

                case 4:
                    System.out.print("Введите дату начала недели (yyyy-MM-dd): ");
                    LocalDate startOfWeek = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.println("Задачи с " + startOfWeek + " по " + startOfWeek.plusDays(6) + ":");
                    taskManager.displayTasks(taskManager.getTasksForWeek(startOfWeek));
                    break;

                case 5:
                    System.out.print("посмотреть историю ");
                    for (Task t : taskManager.getHistory()) {
                        System.out.println(t);
                    }
                break;

                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }
        }
    }
}