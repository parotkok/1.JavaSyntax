package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;

/*
Собираем семейство
*/
/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).

Требования:
Программа должна выводить текст на экран.
Класс Human должен содержать четыре поля.
Класс Human должен содержать один метод.
Класс Solution должен содержать один метод.
Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */
public class Solution {
    public static void main(String[] args) {
        Human son1=new Human("Bob", true, 5);
        Human son2=new Human("Bill", true, 12);
        Human daughter1=new Human("Jessie", false, 9);
        ArrayList<Human> childs=new ArrayList<>();
        childs.add(son1);
        childs.add(son2);
        childs.add(daughter1);
        Human dad=new Human("John", true, 40, childs);
        Human mum=new Human("Eve", false, 36, childs);
        ArrayList<Human> parents1=new ArrayList<>();
        parents1.add(dad);
        ArrayList<Human> parents2=new ArrayList<>();
        parents2.add(mum);
        Human grandad1=new Human("Boris", true, 67, parents1);
        Human grandad2=new Human("Mike", true, 65, parents2);
        Human granny1=new Human("Helen", false, 63, parents1);
        Human granny2=new Human("Betty", false, 61, parents2);
        System.out.println(grandad1);
        System.out.println(grandad2);
        System.out.println(granny1);
        System.out.println(granny2);
        System.out.println(dad);
        System.out.println(mum);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter1);
        /*ArrayList<Human> humans=new ArrayList<>(childs);
        humans.add(dad);
        humans.add(mum);
        humans.add(grandad1);
        humans.add(grandad2);
        humans.add(granny1);
        humans.add(granny2);
        for (Human h:humans) {
            System.out.println(h);
        }*/
    }
    public static class Human{
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children=new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name, sex, age);
            this.children=children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
