package com.javarush.task.task04.task0421;

/*
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String c = reader.readLine();
        String b = reader.readLine();
        if (c.equals(b))
            System.out.println("Имена идентичны");
        else if (c.length()== b.length())
            System.out.println("Длины имен равны");
    }
}