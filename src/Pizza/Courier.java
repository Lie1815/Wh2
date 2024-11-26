package Pizza;

import java.util.ArrayList;

public class Courier {


  int capacity ;
  int count;
  ArrayList<Order> stor = new ArrayList<>();

  public void takeOrders(Order o ){
    if (count+1 <= capacity){
        stor.add(o);
    }     else{
        System.out.println("багажник переполнен");
    }
  }
  public boolean freeSpace() {
      return count + 1 <= capacity;
  }

  public void deliver(int i ){
      System.out.println("Заказ" + stor.get(i).getIDorder() + ' ' + "доставлятся");
        for(; i<stor.size(); i++){
            stor.set(i-1, stor.get(i));
    }
  }

  public Courier(int capacity){
      this.count = 0;
      this.capacity = capacity;
  }
}
