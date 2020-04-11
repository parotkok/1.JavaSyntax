package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Десять котов
*/
/*
Есть класс кот - Cat, с полем "имя" (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
Получить из Map множество(Set) всех котов и вывести его на экран.

Требования:
Программа не должна считывать данные с клавиатуры.
Метод createMap должен создавать новый объект HashMap<String, Cat>.
Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
Метод createMap должен возвращать созданный словарь.
Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
Программа должна вывести всех котов из множества на экран.
 */
public class Solution {
    public static void main(String[] args) {
        printCatSet(convertMapToSet(createMap()));
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> stringCatMap = new HashMap<String, Cat>();
        String [] catNames = new String[] {"Barsik", "Murzik", "Umka", "Bulka", "Baron", "Santa", "Kuzya", "Myauka", "Felix", "Mokriy"};
        Cat [] cats = new Cat[catNames.length];
        for (int i = 0; i < catNames.length; i++){
            stringCatMap.put(catNames[i], new Cat(catNames[i]));
        }
        return stringCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<Cat>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
