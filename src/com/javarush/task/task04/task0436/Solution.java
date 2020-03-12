package com.javarush.task.task04.task0436;

/*
Рисуем прямоугольник
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
