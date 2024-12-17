package Cats.cats.Application;

import Cats.CatsMice.Cats;
import Cats.CatsMice.Mice;

public class Main {
    public static void main(String[] args) {
        Cats cats1 = new Cats("Жужа", 10, 9);
        Cats cats2 = new Cats("Рыжик", 8, 4);
        Cats cats3 = new Cats("Мурзик", 5, 6);
        Cats cats4 = new Cats("Васька", 10, 5);
        Cats cats5 = new Cats("Изя", 12, 8);
        Cats cats6 = new Cats("Шелли", 11, 10);

        Mice mice1 = new Mice(7);
        Mice mice2 = new Mice(2);
        Mice mice3 = new Mice(9);
        Mice mice4 = new Mice(12);
        Mice mice5 = new Mice(8);
        Mice mice6 = new Mice(5);

        cats1.catchmouse(mice1);
        cats1.catchmouse(mice3);
        cats2.catchmouse(mice2);
        cats2.catchmouse(mice5);

        System.out.println("-----------------------------------------------------------");

        cats3.catchmouse(mice6);
        cats3.catchmouse(mice3);
        cats4.catchmouse(mice1);
        cats4.catchmouse(mice4);

        System.out.println("-----------------------------------------------------------");
        cats5.catchmouse(mice5);
        cats5.catchmouse(mice2);
        cats6.catchmouse(mice6);
        cats6.catchmouse(mice1);


        System.out.println("-----------------------------------------------------------");
        cats6.attackCat(cats1);
        cats3.attackCat(cats2);
        cats1.attackCat(cats4);
        cats5.attackCat(cats3);
        cats2.attackCat(cats6);

        System.out.println("-----------------------------------------------------------");

        System.out.println(cats1.getname() + " поймал в сумме: " + cats1.getCaughtMice().size() + " мышей.");
        System.out.println(cats2.getname() + " поймал в сумме: " + cats2.getCaughtMice().size() + " мышей.");
        System.out.println(cats3.getname() + " поймал в сумме: " + cats3.getCaughtMice().size() + " мышей.");
        System.out.println(cats4.getname() + " поймал в сумме: " + cats4.getCaughtMice().size() + " мышей.");
        System.out.println(cats5.getname() + " поймал в сумме: " + cats5.getCaughtMice().size() + " мышей.");
        System.out.println(cats6.getname() + " поймал в сумме: " + cats6.getCaughtMice().size() + " мышей.");


    }

}
