package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/*
Продолжаем мыть раму
*/
/*
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
Программа не должна считывать данные с клавиатуры.
Объяви переменную типа список строк и сразу проинициализируй ee.
Добавь в список слова: «мама», «мыла», «раму».
После каждого слова добавь в список строку, содержащую слово «именно».
Выведи элементы списка на экран, каждый с новой строки.
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");
        strings.add(1, "именно");
        strings.add(3, "именно");
        strings.add(5, "именно");
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
