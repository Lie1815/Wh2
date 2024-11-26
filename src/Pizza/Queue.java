package Pizza;

import Static.S;

import java.util.ArrayList;

public class Queue {
    static ArrayList<Order> queue = new ArrayList<Order>();

    public static void addOrder(Order o) {
        queue.add(o);
        System.out.println(" заказ" + " " + o.getIDorder() + ' ' + " создан");
    }
    public static void BakeOrders (){
        Order temp  = queue.get(0);
        System.out.println(" заказ" + temp.getIDorder() + ' ' + "готовится");
       if (Storehouse.FreeSpace()){
           Storehouse.StoreOrder(temp);
           System.out.println(" заказ" + temp.getIDorder() + ' ' + "ожидает на складе");
           for (int i = 1; i<queue.size(); i++){
               queue.set(i=1, queue.get(i));
           }
       }else {
           System.out.println("Закончилось место на складе" + temp.getIDorder());
       }
    }
}
