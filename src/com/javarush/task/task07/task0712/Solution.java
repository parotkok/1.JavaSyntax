package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/
/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
Должна быть выведена только одна строка.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<>();

        for (int i=0; i<10; i++){
            strings.add(reader.readLine());
        }
        int max=strings.get(0).length();
        int min=max;
        for (int i=0; i<strings.size(); i++){
            if (max<strings.get(i).length())
                max=strings.get(i).length();
            if (min>strings.get(i).length())
                min=strings.get(i).length();
        }
        for (int i=0; i<strings.size(); i++){
            if (strings.get(i).length()==max||strings.get(i).length()==min){
                System.out.println(strings.get(i));
                break;
            }
        }

    }
}
