package com.javarush.task.task04.task0416;

/*
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        double t = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        t=t%5;
        if (t >= 0.0 && t < 3.0) System.out.println("зеленый");
        if (t >= 3.0 && t < 4.0) System.out.println("желтый");
        if (t >= 4.0 && t < 5.0) System.out.println("красный");

    }
}