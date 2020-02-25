package com.javarush.task.task04.task0429;

/*
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int positive = 0;
        int negative = 0;
        for (int i=0; i<3; i++){
            int a = Integer.parseInt(br.readLine());
            if (a!=0) {

                if (a > 0)
                    positive++;
                else
                    negative++;
            }
        }
        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+positive);
    }
}
