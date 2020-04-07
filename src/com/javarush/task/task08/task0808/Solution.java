package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
10 тысяч удалений и вставок
*/
/*
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только 5 методов.
Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        long start=0;
        long finish=0;

        // ArrayList
        ArrayList arrayList = new ArrayList();
        System.out.println("arrayList");
        //insert
        start=System.currentTimeMillis();
        insert10000(arrayList);
        finish=System.currentTimeMillis();
        System.out.println("arrayList insert:"+(finish-start));
        //get
        start=System.currentTimeMillis();
        get10000(arrayList);
        finish=System.currentTimeMillis();
        System.out.println("arrayList get:"+(finish-start));
        //set
        start=System.currentTimeMillis();
        set10000(arrayList);
        finish=System.currentTimeMillis();
        System.out.println("arrayList set:"+(finish-start));
        //remove
        start=System.currentTimeMillis();
        remove10000(arrayList);
        finish=System.currentTimeMillis();
        System.out.println("arrayList remove:"+(finish-start));

        // LinkedList

        LinkedList linkedList = new LinkedList();
        System.out.println("linkedList");
        //insert
        start=System.currentTimeMillis();
        insert10000(linkedList);
        finish=System.currentTimeMillis();
        System.out.println("linkedList insert:"+(finish-start));
        //get
        start=System.currentTimeMillis();
        get10000(linkedList);
        finish=System.currentTimeMillis();
        System.out.println("linkedList get:"+(finish-start));
        //set
        start=System.currentTimeMillis();
        set10000(linkedList);
        finish=System.currentTimeMillis();
        System.out.println("linkedList set:"+(finish-start));
        //remove
        start=System.currentTimeMillis();
        remove10000(linkedList);
        finish=System.currentTimeMillis();
        System.out.println("linkedList remove:"+(finish-start));
    }

    public static void insert10000(List list) {
        for(int i = 0; i<10000; i++){
            list.add(i);
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for(int i =0; i<10000; i++){
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for(int i = 0; i<10000; i++){
            list.set(i, i);
        }
    }

    public static void remove10000(List list) {
        for(int i = 0; i<10000; i++){
            list.remove(0);
        }
    }

}
