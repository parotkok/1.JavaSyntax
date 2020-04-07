package com.javarush.task.task08.task0817;

import java.util.*;

/*
Нам повторы не нужны
*/
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */
public class Solution {
    public static void main(String[] args) {
        /*Map<String, String> map=createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String,String> pair:map.entrySet()) {
            System.out.println(pair.getKey()+"-"+pair.getValue());
        }*/

    }
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map  = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Иванидзе", "Иван");
        map.put("Иваник", "Петр");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Прутков", "Кузьма");
        map.put("Толстой", "Алексей");
        map.put("Тонкий", "Лев");
        map.put("Пушкин", "Михаил");
        map.put("Кукушкин", "Сергей");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Map<String, String> copy = new HashMap<>(map);
        Collection<String> values= copy.values();
        Iterator<String> iterator=values.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if (Collections.frequency(values, s)>1){
                removeItemFromMapByValue(map, s);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }
}
