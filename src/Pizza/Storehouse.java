package Pizza;

import java.util.ArrayList;

public class Storehouse {
    static
    int count = 0;
    static int capasity = 10;
    static ArrayList<Order> stor;

    public static void StoreOrder(Order o) {
        if (count + 1 < capasity) {
            count++;
            stor.add(o);
            System.out.println("Заказ" + " " +  o.getIDorder() + ' ' + "ожидает на складе");
        } else {
            System.out.println("склад переполнен");
        }
    }

    public static boolean FreeSpace() {
        return count + 1 <= capasity;
    }

    public Order takeOrders() {
        Order temp = stor.get(0);
        count--;

        for(int i = 1; i < stor.size(); i ++){
            stor.set(i-1, stor.get(i));
        }return temp;

}
    public  static boolean Orders(){
        return count - 1 >= 0;
    }

}
