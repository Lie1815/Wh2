package Animal;

public class App {
    public static void main(String[] args) {
        Cat kuza = new Cat("kuza", 10.0);
        kuza.voice();
        kuza.sleep();
        kuza.catchMouse();
        System.out.println("котик ест");
        kuza.eat();
        System.out.println("котик ест");


    }
}
