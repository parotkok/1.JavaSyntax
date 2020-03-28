package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/
/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во
 второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
Программа должна создавать большой массив на 20 целых чисел.
Программа должна считывать с клавиатуры 20 чисел для большого массива.
Программа должна создавать два маленьких массива на 10 чисел каждый.
Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и
 вывести второй маленький массив на экран.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray=new int[20];
        for (int i=0; i<bigArray.length; i++){
            bigArray[i]=Integer.parseInt(reader.readLine());
        }
        int[] firstSmallArray=new int[10];
        int[] secondSmallArray=new int[10];
        for (int i=0; i<firstSmallArray.length; i++){
            firstSmallArray[i]=bigArray[i];
        }
        for (int i=0; i<secondSmallArray.length; i++){
            secondSmallArray[i]=bigArray[i+10];
            System.out.println(secondSmallArray[i]);
        }
    }
}
