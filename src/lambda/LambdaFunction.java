package lambda;

import Static.S;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunction {
    public static void main(String[] args) {
        //Предикат используеться для проверки на соответсвие условию
        //абстрактный метод boolean test (T t)
        Predicate<Integer> isPos = x -> x > 0;
        Predicate<Integer> isNeg = x -> x < 0 ;
        Predicate<Integer> isEven = x -> x % 2 == 0;


        System.out.println(isPos.test(5));
        System.out.println(isPos.and(isEven).test(98));

        //Function преддставляет переход от одного обьекта к другому

        //R apply(T t);

        Function<Integer, Double> minus20 = x -> x * 0.8;
        Function<Integer, String> str = x -> {
            if(x <= 0) throw new IllegalArgumentException("число должно быть положительным");
            return x + "rub";
        };

        System.out.println(minus20.apply(100));
        System.out.println(str.apply(50));

        //consumer для выполнения некоторого действия (напримерб обновление свойств) над обьектом типа Т void accept(T t);
        //supplier для создания обьектов
        //BinaryOperator<T> для выполнения дейтвий над двумя обьектами абстрактный метод Т apply(T t1, T t2);
        // абстрактый метод get
        // Comporator - функю интерфейс
    }


}
