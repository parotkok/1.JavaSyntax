package com.javarush.task.task04.task0439;

/*
Письмо счастья
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name = new BufferedReader(new InputStreamReader(System.in)).readLine();
        for (int i=1; i<=10; i++){
            System.out.println(name+" любит меня.");
        }
    }
}
