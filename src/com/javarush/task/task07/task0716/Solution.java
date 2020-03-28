package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/*
Р или Л
*/
/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза

Требования:
Программа не должна считывать данные с клавиатуры.
Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и
 букву "р" и букву "л" - их нужно оставить.
Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом).
 Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("роза");
        strings.add("лира");
        strings.add("лоза");
        fix(strings);
        for (String i:strings){
            System.out.println(i);
        }

    }
    public static void fix(ArrayList<String> list){
        ArrayList<String> temp=new ArrayList<>();
        for (int i=0; i<list.size(); i++){
            if (list.get(i).contains("р")&&!list.get(i).contains("л")){
                continue;
            }
            /*if (list.get(i).contains("p")){
                list.remove(i);
            }*/
            if (list.get(i).contains("л")&&list.get(i).contains("р")){
                temp.add(list.get(i));
                continue;
            }
            if (list.get(i).contains("л")){
                temp.add(list.get(i));
            }
            temp.add(list.get(i));
        }
        list.clear();
        list.addAll(temp);
    }
}
