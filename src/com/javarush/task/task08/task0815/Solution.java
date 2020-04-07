package com.javarush.task.task08.task0815;

import java.util.*;

/*
Перепись населения
*/
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10
 записей по принципу «Фамилия» - «Имя».
Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */
public class Solution {
    public static void main(String[] args) {
        /*Map<String, String> map=createMap();
        System.out.println("Repeating Firstnames: "+getCountTheSameFirstName(map, "Владимир"));
        System.out.println("Repeating Lastnames: "+getCountTheSameLastName(map, "Слуцкий"));*/
    }
    public static Map<String, String> createMap(){
        Map<String, String> map=new HashMap<>();
        map.put("Сергеев","Пётр");
        map.put("Гагарина","Полина");
        map.put("Билан","Дима");
        map.put("Медведев","Дима");
        map.put("Барыкин","Александр");
        map.put("Путин","Владимир");
        map.put("Лукашенко","Александр");
        map.put("Собянин","Сергей");
        map.put("Слуцкий","Владимир");
        map.put("Трамп","Дональд");
        return map;
    }
    public static int getCountTheSameFirstName(Map<String, String> map, String name){
        Collection<String> value=map.values();
        return Collections.frequency(value, name);
    }
    public static int getCountTheSameLastName(Map<String, String> map, String lastName){
        Set<String> keys=map.keySet();

        return Collections.frequency(keys, lastName);
    }
}
