package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность
*/
/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую
 упорядоченность.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Считай 10 строк с клавиатуры и добавь их в список.
Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого
 элемента, нарушающего такую упорядоченность.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings=new ArrayList<>();
        for (int i=0; i<10; i++){
            strings.add(reader.readLine());
        }
        int order=strings.get(0).length();
        for (int i=1; i<strings.size(); i++){
            if (order>strings.get(i).length()){ //если нарушен порядок
                System.out.println(i);          //выводим значение элемента списка
                break;
            }
            else{
                order=strings.get(i).length();
            }
        }
    }
}
