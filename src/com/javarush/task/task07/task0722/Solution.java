package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/
/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
Саму строку "end" не нужно добавлять в список.
Выведи список на экран, каждое значение с новой строки.
Используй цикл for.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<>();
        while (true){
            String str=reader.readLine();
            if (str.equals("end")){
                break;
            }
            else {
                strings.add(str);
            }
        }
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
