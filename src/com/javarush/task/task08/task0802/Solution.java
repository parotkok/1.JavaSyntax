package com.javarush.task.task08.task0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Map из 10 пар
*/
/*
Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
Программа не должна считывать значения с клавиатуры.
Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
 */
public class Solution {
    public static void main(String[] args) {
        Map<String, String> plants=new HashMap<>();
        plants.put("арбуз", "ягода");
        plants.put("банан", "трава");
        plants.put("вишня", "ягода");
        plants.put("груша", "фрукт");
        plants.put("дыня", "овощ");
        plants.put("ежевика", "куст");
        plants.put("жень-шень", "корень");
        plants.put("земляника", "ягода");
        plants.put("ирис", "цветок");
        plants.put("картофель", "клубень");
        Iterator<Map.Entry<String, String>> iterator=plants.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> pair=iterator.next();
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }

}
