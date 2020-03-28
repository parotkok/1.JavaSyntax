package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку
*/
/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот,
 который для x%2, потом последний.

Требования:
Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список
будет главным, а остальные - дополнительными.
Считать 20 чисел с клавиатуры и добавить их в главный список.
Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
Добавить в третий дополнительный список все остальные числа из главного.
Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
Программа должна вывести три дополнительных списка, используя метод printList.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> neizer=new ArrayList<>();
        for (int i=0; i<20; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer x:numbers) {
            if ((x%3)==0){
                odd.add(x);
            }
            if ((x%2)==0){
                even.add(x);
            }
            if (((x%2)!=0)&&((x%3)!=0)){
                neizer.add(x);
            }
        }

        printList(odd);
        printList(even);
        printList(neizer);
    }
    public static void printList(ArrayList<Integer> list){
        for (Integer x:list) {
            System.out.println(x);
        }
    }
}
