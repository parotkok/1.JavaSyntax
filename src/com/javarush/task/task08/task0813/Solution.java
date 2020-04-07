package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»
*/
/*
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
Не изменяй заголовок метода createSet().
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createSet() должен создавать и возвращать множество (реализация HashSet).
Множество из метода createSet() должно содержать 20 слов на букву «Л».
 */
public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> list = new HashSet<>();
            list.add("лес");
            list.add("лиса");
            list.add("лотос");
            list.add("лилия");
            list.add("ланч");
            list.add("лань");
            list.add("лама");
            list.add("лук");
            list.add("локон");
            list.add("луна");
            list.add("лён");
            list.add("лёжа");
            list.add("лодырь");
            list.add("ласка");
            list.add("любовь");
            list.add("лямка");
            list.add("лом");
            list.add("лимон");
            list.add("лайм");
            list.add("лист");
        return list;
    }

    public static void main(String[] args) {

    }
}
