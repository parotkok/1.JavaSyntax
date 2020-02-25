package com.javarush.task.task04.task0424;

/*
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (b==c&&a!=b)
            System.out.print(1);
        else if (a==b&&c!=b)
            System.out.print(3);
             else if (a==c&&b!=a)
                System.out.print(2);
    }
}
