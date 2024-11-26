package Pizza;

import java.util.ArrayList;
import java.util.List;

public class Baker {

    static Storehouse storehouse;

    public Baker (Storehouse storehouse){
        this.storehouse = storehouse;
    }

    public void processOrders (Order order){
        order.setStatus("в процессе приготовления");
        System.out.println(order);
    }
}
