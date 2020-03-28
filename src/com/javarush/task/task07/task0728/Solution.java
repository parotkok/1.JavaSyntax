package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
В убывающем порядке
*/
/*
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
Программа должна считывать 20 целых чисел с клавиатуры.
Программа должна выводить 20 чисел.
В классе Solution должен быть метод public static void sort(int[] array).
Метод main должен вызывать метод sort.
Метод sort должен сортировать переданный массив по убыванию.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] numbers=new int[20];
        for (int i=0; i<numbers.length; i++){
           numbers[i]=Integer.parseInt(reader.readLine());
        }
        sort(numbers);
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
    public static void sort(int[] array){
        Arrays.sort(array);
        /*
        int min;
        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]){
                 min=array[j];
                 array[j]=array[j+1];
                 array[j+1]=min;
                }
            }
        }
         */
    }

}
