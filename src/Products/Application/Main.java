package Products.Application;

import Products.classes.MyProduct;
import Products.classes.Product;

public class Main {
    public static void main(String[] args) {

        Product bread = new Product("хлеб", 9,3, 49, 265);
        Product chiken = new Product("курица", 31, 3.6, 0, 165);
        Product chocolate = new Product("шоколад", 5, 500, 100, 546);
        Product apple = new Product("яблоко", 7, 2, 69 , 121);
        Product cucumber = new Product("огурец", 7, 8, 12, 92);
        Product soda = new Product("газировка", 3, 151,  24,   638);

        MyProduct myProduct = new MyProduct(50 , 50, 300, 1000);

        myProduct.addProduct(apple);
        myProduct.addProduct(chiken);
        myProduct.addProduct(chocolate);
        myProduct.addProduct(cucumber);
        myProduct.addProduct(soda);

        myProduct.printList();



    }
}
