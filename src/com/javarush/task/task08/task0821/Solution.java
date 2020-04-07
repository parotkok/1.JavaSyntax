package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/*
Однофамильцы и тёзки
*/
/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.

Требования:
Программа должна выводить текст на экран.
Класс Solution должен содержать только три метода.
Метод createPeopleMap() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
В методе createPeopleMap() должны добавляться люди с одинаковыми фамилиями.
В методе createPeopleMap() должны добавляться люди с одинаковыми именами.
Метод printPeopleMap() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
Метод main() должен вызывать метод createPeopleMap().
Метод main() должен вызывать метод printPeopleMap().
 */
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map=createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap(){
        Map<String, String> people=new HashMap<>();
        people.put("Ivanov","Ivan");
        people.put("Petrov","Petr");
        people.put("Sidorov","Sidr");
        people.put("Kovalev","Ivan");
        people.put("Kornilov","Ivan");
        people.put("Ivanov","Vladimir");
        people.put("Petrov","Ivan");
        people.put("Tramp","Donald");
        people.put("Pence","Ivan");
        people.put("Makron","Emmanuele");
        return people;
    }

    public static void printPeopleMap(Map<String, String> peoples){
        for (Map.Entry<String, String> peolpe:peoples.entrySet()) {
            System.out.println(peolpe.getKey()+" "+peolpe.getValue());
        }
    }
}
