package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Среднее арифметическое
*/
/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8

б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
Программа должна считывать данные с клавиатуры.
Программа должна выводить данные на экран.
После ввода -1 программа должна корректно завершить работу.
Если последовательно ввести: 1, 2, 2, 4, 5 и -1, программа должна вывести 2.8.
Если последовательно ввести: -100, 0, 100 и -1, программа должна вывести 0.0.
Если последовательно ввести: 1 и -1, программа должна вывести 1.0.
Выведенный результат должен соответствовать заданию для любых входных данных.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        int count = 0;
        int sum = 0;
        double sredneeArif = 0.0;
        while (true){
            number = Integer.parseInt(br.readLine());
            if (number==-1)
                break;
            ++count;
            sum+=number;
        }
        sredneeArif=(double) sum/count;
        System.out.println(sredneeArif);

    }



}
