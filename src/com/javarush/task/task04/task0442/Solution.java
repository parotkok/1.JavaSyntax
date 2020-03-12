package com.javarush.task.task04.task0442;

/*
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            int k=Integer.parseInt(br.readLine());
            sum+=k;
            if (k==-1) {
                System.out.println(sum);
                break;
            }

        }
    }

}
