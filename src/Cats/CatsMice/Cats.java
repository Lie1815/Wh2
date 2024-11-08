package Cats.CatsMice;

import java.util.ArrayList;
import java.util.List;

public class Cats {
    private String name;
    private int speed;
    private int weight;
    private List<Mice> caughtMice;


    public Cats(String name, int speed, int weight){
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.caughtMice = new ArrayList<>();
    }

    public String getname() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public List<Mice> getCaughtMice() {
        return caughtMice;
    }

    public boolean catchmouse (Mice mice){
        if (this.speed > mice.getSpeed() && caughtMice.size() < 100){
            caughtMice.add(mice);
            System.out.println(name +" поймал мышь со скоростью " + mice.getSpeed());
        }else {
            System.out.println(name + " не поймал мышь со скоротью " + mice.getSpeed());

        }
        return false;
    }
    public void attackCat(Cats anotherCats){
        if (this.weight > anotherCats.getWeight()){
            System.out.println(name + " нападает на " + anotherCats.getname());

            for (Mice mice : anotherCats.getCaughtMice()){
                if (this.speed > mice.getSpeed()){
                    this.caughtMice.add(mice);
                    System.out.println(name + " " + " отобрал мышь со скоростью: " + mice.getSpeed() + " " + "у" + " " + anotherCats.getname());
                } else {
                    System.out.println(mice.getSpeed() + " мышь убежала от " + name);
                }
            }
            anotherCats.getCaughtMice().clear();
        }else {
            System.out.println(name + " не смог напать на " + anotherCats.getname() + " из-за маленького веса");
        }

    }
}


