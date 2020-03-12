package com.javarush.task.task05.task0527;

/*
Том и Джерри
*/
/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.

Требования:
Создай класс Dog.
Создай класс Cat.
В классе Dog должно быть три переменные.
В классе Cat должно быть три переменные.
Должен быть создан хотя бы один объект типа Mouse.
Должен быть создан хотя бы один объект типа Dog.
Должен быть создан хотя бы один объект типа Cat.
 */
public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse=new Mouse("Jerry", 6, 4);
        Cat tomCat=new Cat("Tom", 20, 15);
        Dog butchDog=new Dog("Butch", 35, 25);

    }

    public static class Mouse{
        private String name;
        private int height;
        private int tail;

        public Mouse(String name, int height, int tail){
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }

    public static class Cat{
        private String name;
        private int height;
        private int tail;

        public Cat(String name, int height, int tail){
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }

    public static class Dog{
        private String name;
        private int height;
        private int tail;

        public Dog(String name, int height, int tail){
            this.name=name;
            this.height=height;
            this.tail=tail;
        }
    }
}
