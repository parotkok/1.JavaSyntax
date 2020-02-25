package com.javarush.task.task04.task0422;

/*
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());
        if (age<18)
            System.out.println("Подрасти еще");
    }
}
