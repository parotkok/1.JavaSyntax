package com.javarush.task.task05.task0505;



/*
Кошачья бойня
*/
/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.

Требования:
Программа не должна считывать данные с клавиатуры.
Нужно создать три объекта типа Cat.
Нужно провести три боя.
Программа должна вывести результат каждого боя с новой строки.
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat c1 = new Cat("Murzik", 2, 3, 9);
        Cat c2 = new Cat("Barsik", 3, 2, 4);
        Cat c3 = new Cat("Kolobok", 5, 9, 8);

        System.out.println(c1.fight(c2));
        System.out.println(c1.fight(c3));
        System.out.println(c2.fight(c3));
    }


    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
