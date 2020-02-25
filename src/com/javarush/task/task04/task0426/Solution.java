package com.javarush.task.task04.task0426;

/*
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String string = null;
        if (num==0){
            System.out.println("ноль");
            return;
        }

        if (num>0)
            string="положительное ";
        else string="отрицательное ";
        if (num%2==0)
            string=string+"четное число";
        else
            string=string+"нечетное число";
        System.out.println(string);
    }
}
