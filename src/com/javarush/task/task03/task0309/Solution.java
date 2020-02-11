package com.javarush.task.task03.task0309;

/*
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int summa=0; //значение суммы
        int a=1;     //счетчик
        while (a<=5){
            summa=summa+a;
            a++;
            System.out.println(summa);
        }

    }
}
