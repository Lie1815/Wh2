package Menu;

import java.time.LocalDate;
import java.util.Calendar;

public class Task {
     String title;
     LocalDate date;
    String discription;


    public Task(String title, LocalDate date, String discription) {
        this.title = title;
        this.date = date;
        this.discription = discription;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDiscription() {
        return discription;
    }

    public String toString() {
        return  "   название: " + title + '\n' +
                "   дата: " + date + '\n'+
                "   описание: " + discription + '\n';
    }

    protected Calendar computelfAbsent(LocalDate date, Object o) {
        return null;
    }
}
