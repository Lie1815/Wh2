package Phones;

public class Phone {
private int num;
private String model;
private double weight;
private int price;

    public Phone(int num, String model, double weight, int price){
        this.model = model;
        this.num = num;
        this.weight = weight;
        this.price = price;
}

    public String toString(){
    return "Phone {" + "num "+ num + "   " + "model " + model +  "   " + "weight " + weight + "   " + "price " + price + " " + "}";
}

    public String getModel() {
        return model;
    }

    public int getNum() {
        return num;
    }

    public double getWeight() {
        return weight;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
