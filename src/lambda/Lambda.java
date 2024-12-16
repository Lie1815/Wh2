package lambda;

import java.util.function.Consumer;

public class Lambda {
    private static void calculate( Operatiojn operatiojn, double a , double b){
        System.out.println("Результат: " + operatiojn.execute(a, b));
    }


    public static void main(String[] args) {

        Operatiojn plus = (first, second) -> first + second;
        Operatiojn minus = (first, second) -> first - second;
        Operatiojn mult = (first, second) -> first * second;
        System.out.println(plus);
        System.out.println(plus.execute(2, 12));


        Operatiojn div = (a, f) -> {
            if (f==0) return 0;
            return a/f;
        };
        System.out.println(div);
        System.out.println(div.execute(12, 4));
        calculate(mult, 1, 4);
        calculate(div, 6,2);
        calculate(minus, 3, 1);
        calculate(plus, 2123, 1);
    }

   Consumer<Course> = course -> s
    }
}
