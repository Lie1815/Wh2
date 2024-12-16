package Static;

public class CountDown {
    public static void main(String[] args) throws InterruptedException{
    for (int i = 10; i >=  0; i-- ){
        Thread.sleep(1000);
        System.out.print("\r" + i );
        }
    }
}
