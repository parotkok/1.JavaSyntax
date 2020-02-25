package com.javarush.task.task04.task0412;

/*
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n > 0)
        n = n*2;
        else {
            if (n<0)
                n++;
            else n=0;
        }
        System.out.println(n);
        //напишите тут ваш код
    }
}