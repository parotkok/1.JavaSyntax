package com.javarush.task.task04.task0432;

/*
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int n = Integer.parseInt(br.readLine());
        while (n>0){
            System.out.println(st);
            n--;
        }
    }
}
