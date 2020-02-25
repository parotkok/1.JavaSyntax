package com.javarush.task.task04.task0428;

/*
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int num = 0; //переменная хранит кол-во положительных чисел
        if (a>0)
            num++;
        if (b>0)
            num++;
        if (c>0)
            num++;
        System.out.println(num);

    }
}
