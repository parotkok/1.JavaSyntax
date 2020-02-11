package com.javarush.task.task03.task0311;

/*
Печатаем строки
*/

public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s) { //метод добавляет к исходной строке "printing: " и выводит на экран
        System.out.println("printing: "+s);
    }
}
