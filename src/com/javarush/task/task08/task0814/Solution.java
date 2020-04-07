package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Больше 10? Вы нам не подходите
*/
/*
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только три метода.
Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
 */
public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<20; i++){
            set.add(i);
        }
        return set;// напишите тут ваш код
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator=set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10){
                iterator.remove();
            }
        }
        return set;
        // напишите тут ваш код
    }

    public static void main(String[] args) {
        /*Set<Integer> set=createSet();
        set=removeAllNumbersGreaterThan10(set);
        for (Integer a:set) {
            System.out.println(a);
        }*/

    }
}
