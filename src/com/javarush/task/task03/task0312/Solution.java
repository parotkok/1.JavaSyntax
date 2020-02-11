package com.javarush.task.task03.task0312;

/*
Конвертируем время
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToSeconds(21));
        System.out.println(convertToSeconds(22334));
    }
    public static int convertToSeconds(int hour){ //метод конвертирует часы в секунды
    return hour*3600;
    }
}