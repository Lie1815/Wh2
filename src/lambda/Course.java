package lambda;

public class Course {
    private String price;
    private int duration;
    private String name;


    public Course(String price, int duration, String name) {
        this.price = price;
        this.duration = duration;
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }


    public void setPrice(String price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "price=" + price +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                '}';
    }

    public static  Course getInstance(){
        String[] names = {"Java", "Python", "Node js", "C++"};
        return new Course(
                names[(int)(Math.random() * names.length)], (int)((Math.random() * 4) +1), 
        );

    }
}
