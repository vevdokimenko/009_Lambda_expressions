package practice;

/*
 * Задание 1
 * Создайте и вызовите следующие лямбда-выражения.
 * Варианты лямбда-выражений:
 * ■ Проверка на четность;
 * ■ Проверка на нечетность;
 * ■ Число находится в диапазоне от A до B;
 * ■ Проверка на кратность параметру A.
 * */

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Проверка на четность
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(a));
        System.out.println(isEven.test(b));

        System.out.println("=============");

        // Проверка на нечетность
        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isOdd.test(a));
        System.out.println(isOdd.test(b));

        System.out.println("=============");

        // Число находится в диапазоне от A до B
        Range range = (start, end, num) -> (num >= start && num <= end);
        System.out.println(range.isInRange(1, 5, a));
        System.out.println(range.isInRange(1, 5, b));

        System.out.println("=============");

        // Проверка на кратность параметру A
        Multiplicity multiplicity = (i, mul) -> i % mul == 0;
        System.out.println(multiplicity.test(a, 5));
        System.out.println(multiplicity.test(b, 2));
    }
}

@FunctionalInterface
interface Range {
    boolean isInRange(int start, int end, int num);
}

@FunctionalInterface
interface Multiplicity {
    boolean test(int i, int mul);
}
