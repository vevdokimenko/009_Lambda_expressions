package homework;

/*
 * Задание 2
 * Создать список и заполнить рандомными числами 10 ячеек,
 * нужно вывести сумму квадратов всех элемента списка.
 * Мы используем метод map() для возведения в квадрат каждого элемента,
 * а потом применяем метод reduce() для свертки всех элементов в одно число.
 * */

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println("List: " + list);

        int sumSquares = list.stream()
                .map((i) -> (int) Math.pow(i, 2))
                .reduce(Integer::sum)
                .get();

        System.out.println("Sum of squares = " + sumSquares);
    }
}
