package com.javarush.task.task10.task1013;
/*
Конструкторы класса Human
*/
/*
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Требования:
Программа не должна считывать данные с клавиатуры.
В классе Human должно быть 6 полей.
Все поля класса Human должны быть private.
В классе Human должно быть 10 конструкторов.
Все конструкторы класса Human должны быть public.
 */
public class Solution {
    public static void main(String[] args) {

    }
    public class Human{
        private String name;
        private int age;
        private boolean sex;
        private double weight;
        private short height;
        private String address;
        public Human(String name){
            this.name=name;
        }
        public Human(String name, int age){
            this(name);
            this.age=age;
        }
        public Human(String name, int age, boolean sex){
            this(name, age);
            this.sex=sex;
        }
        public  Human(String name, int age, boolean sex, double weight){
            this(name, age, sex);
            this.weight=weight;
        }
        public Human(String name, int age, boolean sex, double weight, short height){
            this(name, age, sex, weight);
            this.height=height;
        }
        public Human(String name, int age, boolean sex, double weight, short height, String address){
            this(name, age, sex, weight, height);
            this.address=address;
        }
        public Human(String name, int age, boolean sex, String address){
            this(name, age, sex);
            this.address=address;
        }
        public Human(String name, boolean sex, String address){
            this(name);
            this.sex=sex;
            this.address=address;
        }
        public Human(boolean sex, int age, String address){
            this.sex=sex;
            this.age=age;
            this.address=address;
        }
        public Human(String name, boolean sex, double weight, short height){
            this(name);
            this.sex=sex;
            this.weight=weight;
            this.height=height;
        }
    }
}
