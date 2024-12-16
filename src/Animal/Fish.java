package Animal;

public class Fish extends Pets{
    public Fish(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("ест");

    }

    @Override
    public void voice() {
        System.out.println("...буль");

    }

    @Override
    public void play() {
        System.out.println("плавает");
    }
}
