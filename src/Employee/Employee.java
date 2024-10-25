package Employee;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;


    public Employee(int salary, int age, String name, String company){
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }


    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "Employee { " + " " + "name " + name + " " + "company" + company + " " + "salary " + salary + " " + "age " + age + " " + "}";
    }
}
