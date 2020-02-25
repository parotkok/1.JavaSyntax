package com.javarush.task.task04.task0414;

/*
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        if (i%400 == 0)
            System.out.println("количество дней в году: "+"366");
        else {
            if (i % 100 == 0)
                System.out.println("количество дней в году: " + "365");
            else {
                if (i % 4 == 0)
                    System.out.println("количество дней в году: " + "366");
                else System.out.println("количество дней в году: " + "365");
            }
        }
    }
}