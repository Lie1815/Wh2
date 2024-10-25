package Products.classes;

public class Product  {
    private String name;
    private double protein;
    private double fats;
    private double carbohydrates;
    private double calories;


    public Product(String name, double protein, double fats, double carbohydrates, double calories) {
        this.fats = fats;
        this.protein = protein;
        this.name = name;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
    }



    public Product(String name,  double calories){
        this(name , 0   , 0 , 0 , calories);
    }

    public Product(String name){
        this(name, 0, 0 , 0, 0);
    }

    public Product(String name, double protein, double fats){
        this(name, protein, fats, 0, 0);
    }

    public String getName(){
        return name;
    }

    public double getProtein(){
        return protein;
    }

    public double getFats(){
        return fats;
    }
    public double getCarbohydrates(){
        return carbohydrates;
    }

    public double getCalories(){
        return calories;
    }

    public String toString() {
        return "MyProduct{" +
                "name='" + name + '\'' +
                ", protein=" + protein +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }

public boolean isValue (double maxcalories, double maxcarbohydrates, double maxfats, double maxprotein){
        return protein <= maxprotein && carbohydrates <= maxcarbohydrates && fats <= maxfats && calories <= maxcalories;

}

}
