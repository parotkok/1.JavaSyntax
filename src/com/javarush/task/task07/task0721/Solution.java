package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
*/
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
Создай массив целых чисел (int[]) на 20 элементов.
Считай с клавиатуры 20 целых чисел и добавь их в массив.
Найди и выведи через пробел максимальное и минимальное числа.
Используй цикл for.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] ints=new int[20];
        for (int i=0; i<ints.length; i++){
            ints[i]=Integer.parseInt(reader.readLine());
        }
        int max=ints[0];
        int min=ints[0];
        for (int i=1; i<ints.length; i++){
            if (max<ints[i]){
                max=ints[i];
            }
            if (min>ints[i]){
                min=ints[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
