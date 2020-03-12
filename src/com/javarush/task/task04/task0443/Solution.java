package com.javarush.task.task04.task0443;

/*
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int year = Integer.parseInt(br.readLine());
        int month = Integer.parseInt(br.readLine());
        int date = Integer.parseInt(br.readLine());
        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+date+"."+month+"."+year);
    }
}
