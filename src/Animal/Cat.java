package Animal;

public class Cat extends Pets {


    public Cat(String name, double weight) {
        super(name, weight);
    }


    public void sleep(){
        System.out.println("кот спит");
    }
    @Override
    public void eat() {
        eat();
    }

    @Override
    public void voice() {
        System.out.println("Мяу");

    }

    @Override
    public void play() {

    }
    public  void catchMouse(){
        System.out.println("кот поймал мышь");
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }
}
