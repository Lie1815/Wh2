package Animal;

public class Dog extends Pets{
    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
    }

    @Override
    public void voice() {
        System.out.println("гав");
    }
    public void sleep(){
        System.out.println("собачка спит");
    }
    @Override
    public void play() {
        System.out.println("играет");
    }

    public void fetchslipperts(){
        System.out.println("приносит тапочки");
    }}