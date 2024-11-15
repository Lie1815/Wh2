package Animal;
abstract public class Pets {
    private String name;
    private double weight;
    private double weightPluse;

    public Pets(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void sleep(){
        System.out.println("я  сплю");
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){
        weightPluse = getWeight() + 0.8;
        weight = weightPluse;
    }

    public abstract void voice();
    public abstract void play();


}
