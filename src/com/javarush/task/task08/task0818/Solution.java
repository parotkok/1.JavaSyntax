package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Только для богачей
*/
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
 */
public class Solution {
    public static void main(String[] args) {
        /*Map<String, Integer> map=createMap();
        removeItemFromMap(map);
        for (Map.Entry<String,Integer> people:map.entrySet()) {
            System.out.println(people.getKey()+"-"+people.getValue());
        }*/
    }
    public static Map<String, Integer> createMap(){
        Map<String, Integer> map=new HashMap<>();
        map.put("Smith", 600);
        map.put("Snail", 900);
        map.put("McCaffey", 285);
        map.put("Gates", 2600);
        map.put("Bormann", 3600);
        map.put("Forbes", 300);
        map.put("Lenin", 369);
        map.put("Gorbachev", 153);
        map.put("Tramp", 550);
        map.put("Pence", 500);
        return map;
    }
    public static void removeItemFromMap(Map<String, Integer> map){
        Iterator<Map.Entry<String, Integer>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            if (entry.getValue()<500){
                it.remove();
            }
        }
    }
}
