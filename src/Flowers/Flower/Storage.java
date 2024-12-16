package Flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Bouquet> bouquets;
    private List<Flowers> flowers;


    public Storage(){
        bouquets = new ArrayList<>();
        flowers = new ArrayList<>();
    }

    public void addBouquet(Bouquet bouquet){
        bouquets.add(bouquet);
    }

    public void addFlowers(Flowers flower){
        flowers.add(flower);
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public List<Bouquet> getBouquets() {
        return bouquets;
    }
}

