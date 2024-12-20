package Booble;

import java.util.ArrayList;
import java.util.List;

public class App {

    private List<Person> personList;

    public App() {
        personList = new ArrayList<>();
    }


    public void addPerson (String name, String lastname, int age){
        personList.add(new Person(name, lastname, age));
    }

    public static void main(String[] args) {

    }
}
