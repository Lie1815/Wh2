package Menu;


import java.time.LocalDate;
import java.util.*;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<Task>();

    private Map<Date, List<Task>> task = new HashMap<>();
    private Stack<Task> history = new Stack<>();
    private static final int HISTORY_LIMIT = 5;


    public void addHistory(Task task) {
        if (history.size() >= HISTORY_LIMIT) {
            history.remove(0);
        }
        history.push(task);
    }

    public List<Task> getHistory() {
        return new ArrayList<>(history);
    }
    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksForDate(LocalDate date) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getDate().equals(date)) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> getTasksForWeek(LocalDate date) {
        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.getDate().isBefore(date) && !task.getDate().isAfter(date.plusDays(6))) {
                result.add(task);
            }
        }
        return result;
    }

    public void displayTasks(List<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Задачи не найдены.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
                addHistory(task);
            }
        }
    }
}




