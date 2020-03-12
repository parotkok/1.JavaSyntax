package com.javarush.task.task05.task0516;

/*
Друзей не купишь
*/
/*
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол

Требования:
У класса Friend должна быть переменная name с типом String.
У класса Friend должна быть переменная age с типом int.
У класса Friend должна быть переменная sex с типом char.
У класса должен быть конструктор, принимающий в качестве параметра имя и инициализирующий соответствующую
 переменную класса.
У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий
 соответствующие переменные класса.
У класса должен быть конструктор, принимающий в качестве параметров имя, возраст, пол и инициализирующий
 соответствующие переменные класса.
 */
public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String name){
        this.name=name;
    }

    public Friend(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Friend(String name, int age, char sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public static void main(String[] args) {

    }
}
