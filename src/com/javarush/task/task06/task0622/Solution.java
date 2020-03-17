package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/
/*
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
Программа должна считывать 5 чисел с клавиатуры.
Программа должна выводить 5 чисел, каждое с новой строки.
Выведенные числа должны быть отсортированы по возрастанию.
Вывод должен содержать те же числа, что и были введены (порядок не важен).
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int [] num = new int[5];

        for (int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        int tmp;
        for (int i=0; i<num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
            System.out.println(num[i]);
        }

/*
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }

 */
    }
}
