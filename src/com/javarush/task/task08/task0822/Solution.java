package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Минимальное из N чисел
*/
/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
Программа должна выводить текст на экран.
Программа должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
Метод getMinimum() должен вернуть минимальное число среди элементов списка.
Метод main() должен вызывать метод getIntegerList().
Метод main() должен вызывать метод getMinimum().
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getMinimum(getIntegerList()));
    }

    public static List<Integer> getIntegerList(){
        List<Integer> integers=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try {
            n=Integer.parseInt(reader.readLine());
            for (int i=0; i<n; i++){
                integers.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (Exception e){
            System.out.println("Vvedite tseloe chislo!");
        }
        return integers;
    }
    public static int getMinimum(List<Integer> list){
        return Collections.min(list);
    }
}
