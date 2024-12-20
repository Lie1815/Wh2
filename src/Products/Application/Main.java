package Products.Application;

import Products.classes.MyProduct;
import Products.classes.Product;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        MyProduct myProduct = new MyProduct(100, 70, 200, 2000);
        Scanner scanner = new Scanner(System.in);

        String name = null;
        for (int i = 0; i < 6; i++) {
            System.out.print("Введите название продукта: ");
            name = scanner.nextLine();
            System.out.print("Введите количество белков: ");


            double proteins = scanner.nextDouble();
            System.out.print("Введите количество жиров: ");
            double fats = scanner.nextDouble();
            System.out.print("Введите количество углеводов: ");
            double carbohydrates = scanner.nextDouble();
            scanner.nextLine();

            myProduct.addProduct(name, proteins, fats, carbohydrates);
        }
        myProduct.displayProducts();
        scanner.close();
    }
}
