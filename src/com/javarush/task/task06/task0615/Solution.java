package com.javarush.task.task06.task0615;

/*
Феншуй и статики
*/
/*
Переставь один модификатор static, чтобы пример скомпилировался.

Требования:
Метод main менять нельзя.
Добавь модификатор static в нужное место.
Убери лишний модификатор static.
В программе должно быть только 2 модификатора static.
 */
public class Solution {
    public static int A = 5;  //если main-статический,то и переменная A тоже должна быть статической
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}
