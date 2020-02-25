package com.javarush.task.task04.task0427;

/*
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (num<1 || num>999)
            return;
        String s = null;
        if (num%2==0)
            s="четное";
        else s="нечетное";
        if (num<=9)
            s=s+" однозначное число";
        else if (num<=99)
            s=s+" двузначное число";
            else s=s+" трехзначное число";
        System.out.println(s);
    }
}
