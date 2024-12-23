package Booble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App extends Arrperson{

    public static  void printPerson(List<Person> people){
        for (Person person : people){
            System.out.println(person);
        }
    }
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Eva", "Aert", 20));
        personList.add(new Person("Иван", "Dfbn", 35));
        personList.add(new Person("Michael", "Isabella", 24));
        personList.add(new Person("Emma", "Dohn", 40));
        personList.add(new Person("John", "Dfew", 45));
        personList.add(new Person("Sophia", "Smrt", 19));
        personList.add(new Person("Ava", "Wsos", 27));
        personList.add(new Person("Sophia", "Lasf", 42));
        personList.add(new Person("William", "Mewe", 37));
        personList.add(new Person("Eva", "Qwer", 25));


        System.out.println("Список: ");
        printPerson(personList);

        System.out.println("-------------------------------------------------");
        System.out.println("сортировка выбором: ");
        selectionsort(personList);
        printPerson(personList);

        System.out.println("-------------------------------------------------");
        System.out.println("сортировка методом втавки: ");
        inSort(personList);
        printPerson(personList);
    }
}