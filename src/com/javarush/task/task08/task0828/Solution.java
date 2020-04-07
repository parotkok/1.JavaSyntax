package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Номер месяца
*/
/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.

Требования:
Программа должна считывать одно значение с клавиатуры.
Программа должна выводить текст на экран.
Программа должна использовать коллекции.
Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        String month=new BufferedReader(new InputStreamReader(System.in)).readLine();
        Map<String, Integer> months=new HashMap<>();
        months.put("JANUARY", 1);
        months.put("FEBRUARY", 2);
        months.put("MARCH", 3);
        months.put("APRIL", 4);
        months.put("MAY", 5);
        months.put("JUNE", 6);
        months.put("JULY", 7);
        months.put("AUGUST", 8);
        months.put("SEPTEMBER", 9);
        months.put("OCTOBER", 10);
        months.put("NOVEMBER", 11);
        months.put("DECEMBER", 12);
        //System.out.println(month+" is the "+months.get(month.toUpperCase())+" month");
        System.out.printf("%s is the %d month\n", month, months.get(month.toUpperCase()));
    }
}
