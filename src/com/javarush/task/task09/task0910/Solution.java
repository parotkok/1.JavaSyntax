package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/*
Исключение при работе с коллекциями List
*/
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);

Требования:
Программа должна выводить сообщение на экран.
В программе должен быть блок try-catch.
Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
Выведенное сообщение должно содержать тип возникшего исключения.
Имеющийся код в методе main не удалять.
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try{
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e){
            //напишите тут ваш код
            System.out.println(e);
        }
    }
}
