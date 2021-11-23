package homework;

/*
 * Задание
 * Напишите основные арифметические действия калькулятора используя лямбда-выражения
 * */

import java.util.function.BiFunction;

public class Extra {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        BiFunction<Integer, Integer, Integer> addition = Integer::sum;
        BiFunction<Integer, Integer, Integer> subtraction = (i1, i2) -> i1 - i2;
        BiFunction<Integer, Integer, Double> division = (i1, i2) -> (double) i1 / i2;
        BiFunction<Integer, Integer, Integer> multiplication = (i1, i2) -> i1 * i2;

        System.out.println("a + b = " + addition.apply(a, b));
        System.out.println("a - b = " + subtraction.apply(a, b));
        System.out.println("a / b = " + division.apply(a, b));
        System.out.println("a * b = " + multiplication.apply(a, b));
    }
}
