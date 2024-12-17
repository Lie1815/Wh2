package Employee;

import java.util.*;

public class Main {
    static Employee generateEmployee() {
        Random rand = new Random();
        int salary = (int) (Math.random() * 100000);
        int age = 21 + rand.nextInt(40);
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


        Collections.sort(employees,Comparator.comparing(Employee::getName));
        System.out.println("`````````````````````````````````````````````````````````````````````````````````");
        System.out.println("сортировка по имени: ");
        employees.forEach(System.out::println);

        Collections.sort(employees,Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        System.out.println("`````````````````````````````````````````````````````````````````````````````````");
        System.out.println("сортировка по имени и зп: ");
        employees.forEach(System.out::println);

        Collections.sort(employees,Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).thenComparing(Employee::getCompany).thenComparing(Employee::getAge));
        System.out.println("`````````````````````````````````````````````````````````````````````````````````");
        System.out.println("сортировка по имени, зп. компании  и возрасту: ");
        employees.forEach(System.out::println);
    }

    }

