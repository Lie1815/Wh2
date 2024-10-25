package Employee;

import java.util.*;

public class Main {
    static Employee generateEmployee() {
        Random rand = new Random();
        int salary = (int) (Math.random() * 100000);
        int age = 21 + rand.nextInt(50);
        List<String> names = new ArrayList<>(Arrays.asList(
                "John", "Emma", "Michael", "Sophia", "William",
                "Olivia", "James", "Ava", "Alexander", "Isabella"
        ));
        Collections.shuffle(names);
        List<String> company = new ArrayList<>(Arrays.asList(
                "soda", "asdkc", "fcwef", "Sophia", "eqpm",
                "Oli", "Jd", "Ava2", "Alex", "bella1"));

        Collections.shuffle(company);
        return new Employee(salary, age, names.get(0), company.get(0));

    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 30; i++) {

            employees.add(generateEmployee());
        }
        for (int i = 0; i < 30; i++) {
            System.out.println(employees.get(i));
        }
   }
    }

