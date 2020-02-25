package com.javarush.task.task04.task0418;

/*
Минимум двух чисел
*/

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());

        /*if(n1 < n2)
            System.out.println(n1);
        else System.out.println(n2);*/
        System.out.println((n1 < n2 ? n1:n2));

    }
}