package practice;

/*
 * Задание 2
 * Создайте программу, в которой пользователь вводит 10 чисел.
 * Используйте Stream API и отсортируйте список в обратном порядке и
 * выведите последнее 5 чисел.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %d digit\n", i + 1);
            list.add(
                    new Scanner(System.in).nextInt()
            );
        }

        list.stream()
                .sorted((i1, i2) -> i2 - i1)
                .skip(list.size() - 5)
                .forEach(System.out::println);
    }
}
