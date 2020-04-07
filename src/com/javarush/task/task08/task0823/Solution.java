package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Омовение Рамы
*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
Программа должна выводить текст на экран.
Программа должна считывать строку с клавиатуры.
Класс Solution должен содержать один метод.
Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        String text=new BufferedReader(new InputStreamReader(System.in)).readLine();
        List<String> list= Arrays.asList(text.split(" "));
        for (String s:list) {
            if (s.length()>0){
                System.out.print(s.substring(0,1).toUpperCase()+s.substring(1)+" ");
            }
            else System.out.print(" ");


        }
    }
}
