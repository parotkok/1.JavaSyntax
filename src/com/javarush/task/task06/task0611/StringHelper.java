package com.javarush.task.task06.task0611;

/*
Класс StringHelper
*/
/*
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго

Требования:
Программа не должна считывать данные с клавиатуры.
Методы класса StringHelper должны возвращать строку.
Методы класса StringHelper должны быть статическими.
Методы класса StringHelper должны быть public.
Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */
public class StringHelper {
    public static String multiply(String s, int count) {
        String string=null;
        for (int i=0; i<count; i++) {
            string+=s;
        }
        return string;
    }

    public static String multiply(String s) {
        return s+s+s+s+s;
    }

    public static void main(String[] args) {

    }
}
