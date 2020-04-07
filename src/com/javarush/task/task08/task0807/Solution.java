package com.javarush.task.task08.task0807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
LinkedList и ArrayList
*/
/*
Нужно создать два списка - LinkedList и ArrayList.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Программа должна содержать только три метода.
Метод createArrayList() должен создавать и возвращать список ArrayList.
Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */
public class Solution {
    public static Object createArrayList() {
        return new ArrayList<Object>();
    }

    public static Object createLinkedList() {
        //напишите тут ваш код
        return new LinkedList<Object>();
    }

    public static void main(String[] args) {

    }
}
