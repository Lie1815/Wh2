package Products.classes;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyProduct {

        private double maxProteins;
        private double maxFats;
        private double maxCarbohydrates;
        private double maxCalories;
        private List<Product> productList;

        public MyProduct(double maxProteins, double maxFats, double maxCarbohydrates, double maxCalories) {
            this.maxProteins = maxProteins;
            this.maxFats = maxFats;
            this.maxCarbohydrates = maxCarbohydrates;
            this.maxCalories = maxCalories;
            this.productList = new ArrayList<>();
        }

        public void addProduct(String name, double proteins, double fats, double carbohydrates) {
            double calories = Product.calculateCalories(proteins, fats, carbohydrates);

            if (validateProduct(proteins, fats, carbohydrates, calories)) {
                productList.add(new Product(name, proteins, fats, carbohydrates));
                System.out.println("Продукт добавлен: " + name);
            } else {
                System.out.println("Продукт не может быть добавлен: " + name);
                if (proteins > maxProteins) {
                    System.out.println("Слишком большое содержание белков.");
                }
                if (fats > maxFats) {
                    System.out.println("Слишком большое содержание жиров.");
                }
                if (carbohydrates > maxCarbohydrates) {
                    System.out.println("Слишком большое содержание углеводов.");
                }
                if (calories > maxCalories) {
                    System.out.println("Слишком большое содержание калорий.");
                }
            }
        }

        private boolean validateProduct(double proteins, double fats, double carbohydrates, double calories) {
            return proteins <= maxProteins && fats <= maxFats && carbohydrates <= maxCarbohydrates && calories <= maxCalories;
        }

        public void displayProducts() {
            System.out.println("Список добавленных продуктов:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }

        }