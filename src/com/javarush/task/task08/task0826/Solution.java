package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Пять победителей
*/
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

Требования:
Программа должна выводить числа на экран.
Программа должна считывать значения с клавиатуры.
Класс Solution должен содержать два метода.
Метод sort() должен сортировать массив чисел от большего к меньшему.
Метод main() должен вызывать метод sort().
Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] ints=new int[20];
        for (int i=0; i<ints.length; i++){
            ints[i]=Integer.parseInt(reader.readLine());
        }
        sort(ints);
        for (int i=ints.length-1; i>ints.length-6; i--){
            System.out.println(ints[i]);
        }
    }
    public static void sort(int[] ints){
        Arrays.sort(ints);
    }
}
