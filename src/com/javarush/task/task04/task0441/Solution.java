package com.javarush.task.task04.task0441;

/*
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        int swap = 0;
        if (n1==n2&&n1==n3){
        }
        else {
            if (n1 < n2) {
                swap = n1;
                n1 = n2;
                n2 = swap;
            }
            if (n2 < n3) {
                swap = n2;
                n2 = n3;
                n3 = swap;
            }
            if (n1 < n2) {

                swap = n1;
                n1 = n2;
                n2 = swap;
            }
        }
        System.out.println(n2);
    }
}
