package Animal;

public class Spider extends Pets{

    public Spider(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("ест");
        return 0;
    }

    @Override
    public void voice() {
        System.out.println("шуршит");

    }

    @Override
    public void play() {
        System.out.println("играет");

    }

    public void hidefood(){
        System.out.println("прячет еду");
    }
}
