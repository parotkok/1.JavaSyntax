package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
Гласные и согласные
*/
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .

Требования:
Программа должна считывать данные с клавиатуры.
Программа должна выводить две строки.
Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
Каждая строка должна заканчиваться пробелом.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        //String str=new BufferedReader(new InputStreamReader(System.in)).readLine();
        char[] source=new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        StringBuilder vowels= new StringBuilder("");
        StringBuilder consonants= new StringBuilder("");
        for (int i=0; i<source.length; i++){
            if (source[i]!=' '){
                if (isLetterVowel(source[i])){
                    vowels.append(source[i]).append(" ");
                }
                else consonants.append(source[i]).append(" ");
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
    public static boolean isLetterVowel(char letter){
        boolean isVowel=false;
        char[] vowel=new char[]{'a', 'A', 'E','e', 'I','i', 'O','o', 'U','u', 'Y','y', 'А','а', 'Е','е', 'Ё','ё', 'И','и', 'О','о', 'У','у', 'Э','э', 'Ы','ы', 'Ю','ю', 'Я','я'};
        for (int i=0; i<vowel.length; i++){
            if (letter==vowel[i]){
                isVowel= true;
                break;
            }
        }
        return isVowel;
    }
}
