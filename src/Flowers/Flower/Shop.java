package Flowers.Flower;

import java.util.Stack;

public class Shop {
    private Storage storage;

    public Shop(){
        this.storage = new Storage();
    }

    public Storage getStorage(){
        return  storage;
    }

    public void displayBouqet(){
        for(Bouquet bouquet: storage.getBouquets()){
            System.out.println("Букет из: ");
        for(Flowers flowers: storage.getFlowers()){
            System.out.println("* " + flowers.getName() + "(руб "+ flowers.getPrice() + " с рейтингом " + flowers.getRating() + " )");
        }
        }
    }

}
