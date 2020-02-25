package com.javarush.task.task04.task0415;

/*
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if ((a>=b+c)||(b>=a+c)||(c>=b+a))
            System.out.print("Треугольник не существует.");
        else
            System.out.print("Треугольник существует.");
        }
    }
