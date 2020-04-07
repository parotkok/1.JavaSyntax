package com.javarush.task.task08.task0801;

/*
 Set из растений
*/
/*
Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё 10 строк:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

Требования:
Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
Программа не должна считывать строки с клавиатуры.
Программа должна добавлять в коллекцию 10 строк, согласно условию.
Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> plants=new HashSet<>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("женьшень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");
        Iterator<String> plant=plants.iterator();
        while (plant.hasNext()){
            String text=plant.next();
            System.out.println(text);
        }


    }
}
