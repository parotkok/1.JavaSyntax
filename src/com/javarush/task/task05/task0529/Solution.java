package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
*/
/*
Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit",
 можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}
Требования:
Программа должна считывать данные с клавиатуры.
Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем
 регистре и нажмет Enter.
Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
Программа должна выводить текст на экран.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        int sum = 0;
        while (true){
           s=br.readLine();
           if (s.equals("сумма"))
               break;
           try {
               sum+=Integer.parseInt(s);
           }
           catch (NumberFormatException e){
               System.out.println("Нужно вводить целые числа!");
               continue;
           }
        }
        System.out.println(sum);
    }
}
