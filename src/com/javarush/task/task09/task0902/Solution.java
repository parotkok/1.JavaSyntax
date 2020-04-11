package com.javarush.task.task09.task0902;
/*
И снова StackTrace
*/
/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.

Требования:
В классе должно быть 5 методов (метод main не учитывать).
Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
Каждый метод должен возвращать имя метода, вызвавшего его.
Для получения имени вызвавшего метода, используй метод getMethodName.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(method1());
    }
    public static String method1(){
        method2();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        return stackTraceElements[stackTraceElements.length-1].getMethodName();
    }
    public static String method2(){
        method3();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[stackTraceElements.length-2].getMethodName());
        return stackTraceElements[stackTraceElements.length-2].getMethodName();
    }
    public static String method3(){
        method4();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[stackTraceElements.length-3].getMethodName());
        return stackTraceElements[stackTraceElements.length-3].getMethodName();
    }
    public static String method4(){
        method5();
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[stackTraceElements.length-4].getMethodName());
        return stackTraceElements[stackTraceElements.length-4].getMethodName();
    }
    public static String method5(){
        StackTraceElement[]stackTraceElements=Thread.currentThread().getStackTrace();
        //System.out.println(stackTraceElements[stackTraceElements.length-5].getMethodName());
        return stackTraceElements[stackTraceElements.length-5].getMethodName();
    }
}
