package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Количество букв
*/
/*
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

Требования:
Программа должна 10 раз считывать данные с клавиатуры.
Программа должна выводить текст на экран.
Выведенный текст должен содержать 33 строки.
Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
 */
public class Solution {
    public static void main(String[] args) {
        String abc=new String("абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
        char[] chars=abc.toCharArray();
        //второй вариант
        StringBuffer sb=new StringBuffer();
        List<Character> characterList=new ArrayList<>();
        try {
            for (int i=0; i<10; i++){
                sb.append(new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase());
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            char[] characters=sb.toString().toCharArray();
            for (int i=0; i<characters.length; i++){
                characterList.add(characters[i]);
            }
        }
        List<Integer> countChars=new ArrayList<>();
        for (int i=0; i<chars.length; i++) {
            if (characterList.contains(chars[i])){
                countChars.add(Collections.frequency(characterList, chars[i]));
            }
            else countChars.add(0);
        }
        for (int i=0; i<chars.length; i++){
            System.out.println(chars[i]+" "+countChars.get(i));
        } //конец второго варианта
        //printMap(getCharsToMap(getCharArray(), getMapAbc()), chars); //первый вариант

    }
    //читаем строки и помещаем в массив char[]
    public static char[] getCharArray(){
        StringBuffer sb=new StringBuffer();
        try {
            for (int i=0; i<10; i++){
                sb.append(new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase());
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            return sb.toString().toCharArray();
        }
    }
    //получаем карту отображения с ключами - буквы алфавита
    public static Map<Character, Integer> getMapAbc(){
        String abc=new String("абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
        char[] chars=abc.toCharArray();
        Map<Character, Integer> mapAbc=new HashMap<>();
        for (int i=0; i<chars.length; i++){
            mapAbc.put(chars[i], 0);
        }
        return mapAbc;
    }
    //заполняем карту отображения количеством повторений каждого ключа во входним массиве
    public static Map<Character, Integer> getCharsToMap(char[] abc, Map<Character, Integer> mapAbc){
        for (Map.Entry<Character, Integer> c:mapAbc.entrySet()) {
            for (int i=0; i<abc.length; i++){
                if (c.getKey().compareTo(abc[i])==0){
                    c.setValue(c.getValue()+1);
                }
            }
        }
        return mapAbc;
    }
    //печать содержимого карты в алфавитном порядке - согласно порядку следования символов в массиве
    public static void printMap(Map<Character, Integer> map, char[] chars){

        for (int i=0; i<chars.length; i++){
            System.out.println(chars[i]+" "+map.get(chars[i]));
        }
    }
}
