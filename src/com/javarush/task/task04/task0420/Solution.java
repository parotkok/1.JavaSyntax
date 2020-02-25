package com.javarush.task.task04.task0420;

/*
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in));
        int n1 = Integer.parseInt (bufferedReader.readLine());
        int n2 = Integer.parseInt (bufferedReader.readLine());
        int n3 = Integer.parseInt (bufferedReader.readLine());
        int minim;
        if (n1>n2){
            minim=n1;
            n1=n2;
            n2=minim;
        }
        if (n2>n3){
            minim=n2;
            n2=n3;
            n3=minim;
        }
        if (n1>n2){
            minim=n1;
            n1=n2;
            n2=minim;
        }
        System.out.println(n3+" "+n2+" "+n1);
    }
    /*public static int min(int a, int b){
        return (a<b)? a:b;
    }*/
}