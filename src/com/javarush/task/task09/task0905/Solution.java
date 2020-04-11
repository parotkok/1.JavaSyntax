package com.javarush.task.task09.task0905;
/*
Там, в синих глубинах стек-трейса…
*/
/*
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем
 (количество элементов в списке).
Это же число метод должен выводить на экран.

Требования:
Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
Воспользуйся методом Thread.currentThread().getStackTrace().
Метод main должен вызывать метод getStackTraceDepth.
 */
public class Solution {
    public static void main(String[] args) {
        int depth=getStackTraceDepth();
    }
    public static int getStackTraceDepth(){
        int depth=Thread.currentThread().getStackTrace().length;
        System.out.println(depth);
        return depth;
    }
}
