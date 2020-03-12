package com.javarush.task.task05.task0522;

/*
Максимум конструкторов
*/
/*
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.

Требования:
У класса должно быть хотя бы три переменные.
У класса должен быть конструктор по умолчанию.
У класса должен быть хотя бы один конструктор.
У класса должно быть хотя бы два конструктора.
У класса должно быть хотя бы три конструктора.
У класса должно быть хотя бы четыре конструктора.
 */
public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x) {
        this(x, 5, 5);
    }
    public Circle (double x, double y) {
        this(x, y, 5);
    }
    public Circle (double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle () {
        this(1, 2, 3);

    } //напишите тут ваш код

    public Circle(Circle circle){
        this(circle.x, circle.y, circle.radius);
    }

    public static void main(String[] args) {

    }
}
