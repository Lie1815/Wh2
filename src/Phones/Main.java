package Phones;

import java.text.Collator;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    static Phone generatePhone() {
        int num = (int) (Math.random() * 100000);
        int price = (int) (Math.random() * 10000);
        double temp = Math.random();
        double weight = temp - (temp % 0.01);
        String model = (char)(new Random().nextInt(15) + 'a') + new DecimalFormat("30").format(Math.random() * 100);
        return new Phone(num, model, weight, price);
    }

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            phones.add(generatePhone());
        }
        phones.sort(Comparator.comparing(phone -> phone.getPrice()));
        System.out.println("сортировка по цене: ");
        phones.forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------------");
        phones.sort(Comparator.comparing(phone -> phone.getNum()));
        System.out.println("сортировка по номеру: ");
        phones.forEach(System.out::println);
    }
    public class PhoneSort {
        public static void main(String[] args) {




        }
    }

}
