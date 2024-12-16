package Flowers.Application;

import Flowers.Flower.Bouquet;
import Flowers.Flower.Customer;
import Flowers.Flower.Flowers;
import Flowers.Flower.Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Flowers flowers1 = new Flowers("Розы", 120.0, 3);
        Flowers flowers2 = new Flowers("Алиум", 121.0, 1);
        Flowers flowers3 = new Flowers("Гвоздика", 50.0, 5);
        Flowers flowers4 = new Flowers("Гипсофила", 12.0, 2);
        Flowers flowers5 = new Flowers("Гортензия", 90.0, 4);
        Flowers flowers6 = new Flowers("Лаванда", 140.0, 6);

        Bouquet bouquet = new Bouquet(10);
        bouquet.addFlowers(flowers1);
        bouquet.addFlowers(flowers2);
        bouquet.addFlowers(flowers3);
        bouquet.addFlowers(flowers4);
        bouquet.addFlowers(flowers5);
        bouquet.addFlowers(flowers6);

        shop.getStorage().addBouquet(bouquet);
        shop.displayBouqet();

        Customer customer = new Customer("Алиса");
        Customer customer1 = new Customer("Ирина");
        Customer customer2 = new Customer("Аркадий");
        Customer customer3 = new Customer("Дмитрий");
        Customer customer4 = new Customer("Мария");

        System.out.println("Покупатель " + customer1.getName());
        System.out.println("Покупатель " + customer2.getName());
        System.out.println("Покупатель " + customer3.getName());
        System.out.println("Покупатель " + customer4.getName());
        System.out.println("Покупатель " + customer.getName());
        }
}
