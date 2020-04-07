package com.javarush.task.task08.task0827;

import java.util.*;

/*
Работа с датой
*/
/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false

Требования:
Программа должна выводить текст на экран.
Класс Solution должен содержать два метода.
Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
Метод main() должен вызывать метод isDateOdd().
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MARCH 1 2020"));
    }
    public static boolean isDateOdd(String date){
        Date date1=new Date(date);
        GregorianCalendar gc=new GregorianCalendar(date1.getYear(), date1.getMonth(), date1.getDate());
        /*
        Map<String, Integer> months=new HashMap<>();
        months.put("JANUARY", 0);
        months.put("FEBRUARY", 1);
        months.put("MARCH", 2);
        months.put("APRIL", 3);
        months.put("MAY", 4);
        months.put("JUNE", 5);
        months.put("JULY", 6);
        months.put("AUGUST", 7);
        months.put("SEPTEMBER", 8);
        months.put("OCTOBER", 9);
        months.put("NOVEMBER", 10);
        months.put("DECEMBER", 11);
        List<String> dateString= Arrays.asList(date.split(" "));
        GregorianCalendar today=new GregorianCalendar();
        today.set(Calendar.YEAR, Integer.parseInt(dateString.get(2)));
        today.set(Calendar.MONTH, months.get(dateString.get(0)));
        today.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateString.get(1)));
        //System.out.println(today.getTime());

        return today.get(Calendar.DAY_OF_YEAR)%2!=0;

         */

        return gc.get(Calendar.DAY_OF_YEAR)%2!=0;
    }
}
