package com.javarush.task.task05.task0508;

/*
Геттеры и сеттеры для класса Person
*/
/*
Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.

Требования:
Программа не должна считывать данные с клавиатуры.
В классе Person должен быть метод public static void main.
Класс Person должен иметь 3 переменные.
У класса Person должна быть переменная name с типом String.
У класса Person должна быть переменная age с типом int.
У класса Person должна быть переменная sex с типом char.
У класса Person должен быть сеттер для переменной name.
У класса Person должен быть геттер для переменной name.
У класса Person должен быть сеттер для переменной age.
У класса Person должен быть геттер для переменной age.
У класса Person должен быть сеттер для переменной sex.
У класса Person должен быть геттер для переменной sex.
 */
public class Person {
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
