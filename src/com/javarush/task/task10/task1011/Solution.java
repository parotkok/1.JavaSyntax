package com.javarush.task.task10.task1011;
/*
Большая зарплата
*/
/*
Вывести на экран надпись "Я не хочу изучать Java, я хочу большую зарплату" 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
...
зарплату

Требования:
Программа должна выводить текст на экран.
Программа должна выводить 40 строк.
В программе должен использоваться цикл for или while.
Выведенный текст должен соответствовать примеру из условия.
 */
public class Solution {
    public static void main(String[] args) {
        String s="Я не хочу изучать Java, я хочу большую зарплату";
        for (int i=0; i<40; i++){
            System.out.println(s.substring(i));
        }
    }
}
