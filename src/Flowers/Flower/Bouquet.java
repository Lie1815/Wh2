package Flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {

    private List<Flowers> flowers;
    private int maxFlowers;

    public Bouquet(int maxFlowers) {
        this.maxFlowers = 15;
        this.flowers = new ArrayList<>();
    }
 public void addFlowers(Flowers flower){
        if(flowers.size() >= maxFlowers){
            throw new IllegalArgumentException("максимальное число цветов в букете: " + maxFlowers);
        }
        flowers.add(flower);
 }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public int getMaxFlowers() {
        return maxFlowers;
    }
}
