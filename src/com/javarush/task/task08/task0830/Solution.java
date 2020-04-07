package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Задача по алгоритмам
*/
/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.

Требования:
Программа должна выводить текст на экран.
Программа должна считывать значения с клавиатуры.
Класс Solution должен содержать три метода.
Метод main() должен вызывать метод sort().
Метод sort() должен вызывать метод isGreaterThan().
Выведенные слова должны быть отсортированы в алфавитном порядке.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
       //напишите тут ваш код
        String tmp="";
        for (int i=0; i<array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
               if (isGreaterThan(array[i], array[j])){
                   tmp=array[i];
                   array[i]=array[j];
                   array[j]=tmp;
               }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
