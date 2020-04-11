package com.javarush.task.task09.task0912;
/*
Исключение при работе с числами
*/
/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int num=Integer.parseInt("XYZ");
System.out.println(num);

Требования:
Программа должна выводить сообщение на экран.
В программе должен быть блок try-catch.
Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
Выведенное сообщение должно содержать тип возникшего исключения.
Имеющийся код в методе main не удалять.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try{
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch (NumberFormatException e){
            //напишите тут ваш код
            System.out.println(e);
        }
    }
}
