package Flowers.Flower;

public class Flowers {
    private String name;
    private  double price;
    private int rating;


    public Flowers(String name, double price, int rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }


    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }


    public int size() {
        return 0;
    }
}
