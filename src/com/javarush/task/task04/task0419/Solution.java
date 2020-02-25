package com.javarush.task.task04.task0419;

/*
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System.in));
        int a1 = Integer.parseInt (bufferedReader.readLine());
        int b1 = Integer.parseInt (bufferedReader.readLine());
        int c1 = Integer.parseInt (bufferedReader.readLine());
        int d1 = Integer.parseInt (bufferedReader.readLine());
        System.out.println (max(max(a1,b1),max(c1,d1)));
    }
    public static int max(int a, int b){
        return (a>b)? a:b;
    }
}
