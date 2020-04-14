package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача по алгоритмам
*/
/*
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число - 1-е минимальное.
Следующее минимальное после него - 2-е минимальное

Пример:
1 6 5 7 1 15 63 88
Первое минимальное - 1
Второе минимальное - 1
Третье минимальное - 5
Четвертое минимальное - 6

Требования:
Программа должна считывать данные с клавиатуры.
Программа должна выводить текст на экран.
Класс Solution должен содержать два метода.
Метод sort() должен сортировать массив элементов.
Метод main() должен вызывать метод sort().
Программа должна выводить 10-е и 11-е минимальные числа. Каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] ints=new int[30];
        for (int i=0; i<ints.length; i++){
            ints[i]=Integer.parseInt(reader.readLine());
        }
        sort(ints);
        System.out.println(ints[9]);
        System.out.println(ints[10]);
    }
    public static void sort(int[] array){
        Arrays.sort(array);
    }
}
