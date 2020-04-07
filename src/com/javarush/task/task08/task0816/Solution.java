package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Добрая Зинаида и летние каникулы
*/
/*
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */
public class Solution {
    public static void main(String[] args) {
        /*Map<String, Date> map=createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> k:map.entrySet()) {
            System.out.println(k.getKey()+"-"+k.getValue());
        }*/

    }
    public static Map<String, Date> createMap(){
        Map<String, Date> map=new HashMap<>();
        map.put("Иванов", new Date(1996, 10, 25));
        map.put("Галахов", new Date(1975, 9, 6));
        map.put("Белавинец", new Date(1975, 11, 17));
        map.put("Рендова", new Date(1977, 6, 11));
        map.put("Кочнев", new Date(1978, 5, 9));
        map.put("Макаров", new Date(2008, 6, 4));
        map.put("Дудина", new Date(2008, 7, 20));
        map.put("Попель", new Date(2009, 6, 26));
        map.put("Кравцов", new Date(1976, 8, 5));
        map.put("Кутузов", new Date(1986, 11, 2));
        return map;
    }
    public static void removeAllSummerPeople(Map<String, Date> map){
        Iterator<Map.Entry<String, Date>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair=iterator.next();
            if (pair.getValue().getMonth()>4&&pair.getValue().getMonth()<8){
                iterator.remove();
            }
        }
    }
}
