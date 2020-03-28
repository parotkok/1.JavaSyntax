package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
*/
/*
1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Считай 10 строк с клавиатуры и добавь их в список.
Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа",
 "альфа", "бета", "бета", "гамма", "гамма".
Выведи получившийся список на экран, каждый элемент с новой строки.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<>();
        for (int i=0; i<10; i++){
            strings.add(reader.readLine());
        }
        doubleValues(strings);
        for (String s:strings) {
            System.out.println(s);
        }

    }
    public static void doubleValues(ArrayList<String> list){
        for (int i=0; i<list.size(); i++){
            list.add(i+1, list.get(i));
            i++;
        }
    }
}
