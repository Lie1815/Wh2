package Products.classes;

import java.util.ArrayList;
import java.util.List;

public class MyProduct {
    private double maxprotein;
    private double maxfats;
    private double maxcarbohydrates;
    private double maxcalories;
    private List<Product> products;

    public MyProduct(double maxcalories, double maxcarbohydrates, double maxfats, double maxprotein) {

        this.maxcalories = maxcalories;
        this.maxcarbohydrates = maxcarbohydrates;
        this.maxprotein = maxprotein;
        this.maxfats = maxfats;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        if (product.isValue(maxprotein, maxfats, maxcarbohydrates, maxcalories)){
            System.out.println("продукт " + product.getName() + "   добавлен.");
        }else{
            System.out.println("Продукт " + product.getName() + " не может быть добавлен " + " слишком большое содержание калорий " +
                    "");
        }
    }

    public void printList(){
        System.out.println("список продуктов: ");
        for (Product product : products){
            System.out.println("- " + product.getName());
        }
    }
}
