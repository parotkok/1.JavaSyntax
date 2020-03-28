package com.javarush.task.task07.task0723;

/*
Обратный отсчёт
*/
/*
Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку,
 воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.

Пример:
30
29
...
1
0
Бум!

Требования:
Программа не должна считывать данные с клавиатуры.
Программа должна выводить обратный отсчет от 30 до 0. Каждую цифру на новой строке.
Программа должна выводить "Бум!" после отсчета.
Программа должна использовать метод "Thread.sleep(100);" 31 раз.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        countDown(30);
        System.out.println("Бум!");
    }
    public static void countDown(int t) {
        while (t>=0){
            try {
                Thread.sleep(100);
                System.out.println(t);
                t--;
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
