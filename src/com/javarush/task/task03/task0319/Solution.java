package com.javarush.task.task03.task0319;

/*
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int zarplata = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());
        System.out.print(name + " получает " + zarplata + " через " + age + " лет.");
    }
}
