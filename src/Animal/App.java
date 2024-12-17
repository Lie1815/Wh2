package Animal;

public class App {
    public static void main(String[] args) {
        Cat kuza = new Cat("kuza", 10.0);
        Dog Gogi = new Dog("gogi", 15.0);
        Spider Valera = new Spider("valera", 0.100);
        Fish qwe = new Fish("qwe", 0.50);

        kuza.voice();
        kuza.sleep();
        kuza.catchMouse();
        System.out.println("котик ест");

        System.out.println("--------------------------------------------------------------------------------");

        Gogi.voice();
        Gogi.sleep();
        System.out.println("песик хомячит");

        System.out.println("--------------------------------------------------------------------------------");

        Valera.voice();
        Valera.sleep();
        System.out.println("паучок хомячит");

        System.out.println("--------------------------------------------------------------------------------");

        qwe.voice();
        qwe.sleep();
        System.out.println("рыбка хомячит");



    }
}
