package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/
/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

Требования:
В классе Solution создай public static класс Man.
В классе Solution создай public static класс Woman.
Класс Man должен содержать переменные: name(String), age(int) и address(String).
Класс Woman должен содержать переменные: name(String), age(int) и address(String).
У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
Конструкторы должны инициализировать переменные класса.
В методе main необходимо создать по два объекта каждого типа.
Метод main должен выводить созданные объекты на экран в указанном формате.
 */
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man( "m1", 10, "adM1");
        Man man2 = new Man( "m2", 11, "adM2");
        Woman woman1 = new Woman( "w1", 12, "adW1");
        Woman woman2 = new Woman( "w2", 13, "adW2");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

    }

    //напишите тут ваш код
    public static class Man {
        private int age;
        private String name;
        private String address;

        public Man(String name, int age, String address){
            this.age=age;
            this.name=name;
            this.address=address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        private int age;
        private String name;
        private String address;

        public Woman( String name, int age, String address){
            this.age=age;
            this.name=name;
            this.address=address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }
}
