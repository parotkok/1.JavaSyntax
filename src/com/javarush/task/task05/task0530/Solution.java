package com.javarush.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Шеф, что-то не пашет
*/
/*
Задача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.

Требования:
Программа должна считывать числа с клавиатуры.
В классе должен быть только один метод main.
Программа должна выводить строку, которая начинается на "Sum = ".
Программа должна выводить строку, которая заканчивается суммой введенных чисел.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //String s=br.readLine();
        int sum=0;
        int count=0;
        while (count<2){
            try {

                sum+=Integer.parseInt(br.readLine());
                count++;
            }
            catch (NumberFormatException e){
                System.out.println("Нужно вводить целое число!");
                continue;
            }

        }
        System.out.println(sum);
    }
}
