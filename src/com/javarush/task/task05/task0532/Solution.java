package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам
*/
/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
Программа должна считывать числа с клавиатуры.
Программа должна выводить число на экран.
В классе должен быть метод public static void main.
Нельзя добавлять новые методы в класс Solution.
Программа должна выводить на экран максимальное из введенных N чисел.
Программа не должна ничего выводить на экран, если N меньше либо равно 0.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
            n=Integer.parseInt(br.readLine());
            if (n<=0)
                return;
        int max=Integer.parseInt(br.readLine());
        int i=1;
        while (i<n){
            int m=Integer.parseInt(br.readLine());
            max=(max>m) ? max : m;
            i++;
        }
        System.out.println(max);
    }
}
