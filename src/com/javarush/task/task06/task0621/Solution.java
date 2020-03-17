package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Родственные связи кошек
*/
/*
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

Требования:
Программа должна считывать имена 6 котов в указанном порядке.
Метод main должен создавать 6 объектов типа Cat.
Программа должна выводить 6 строк с информацией о котах.
Строка про дедушку (первая) должна соответствовать условию.
Строка про бабушку (вторая) должна соответствовать условию.
Строка про папу (третья) должна соответствовать условию.
Строка про маму (четвертая) должна соответствовать условию.
Строка про сына (пятая) должна соответствовать условию.
Строка про дочь (шестая) должна соответствовать условию.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String dauhterName = reader.readLine();
        Cat grandFather = new Cat (grandFatherName,null,null);
        Cat grandMother = new Cat (grandMotherName,null,null);
        Cat father = new Cat (fatherName,null,grandFather);
        Cat mother = new Cat (motherName,grandMother,null);
        Cat son = new Cat (sonName,mother,father);
        Cat dauhter = new Cat (dauhterName,mother,father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dauhter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;


        }

        @Override
        public String toString() {
            String s="Cat name is " + this.name+",";

            if (this.mother == null)
                s += " no mother,";
            else
                s+= " mother is " + mother.name+",";

            if (this.father == null)
                s += " no father";
            else
                s+= " father is " + father.name;

            return s;
        }
    }
}
