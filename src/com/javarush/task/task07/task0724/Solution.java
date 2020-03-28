package com.javarush.task.task07.task0724;

/*
Семейная перепись
*/
/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
  Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться
 при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
Программа не должна считывать данные с клавиатуры.
Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Добавить в класс конструктор public Human(String name, boolean sex, int age).
Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father,
 Human mother).
Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
Выведи созданные объекты на экран.
 */
public class Solution {
    public static void main(String[] args) {

        Human grandad1 = new Human ("Bill", true, 61);
        Human grandad2 = new Human ("Donald", true, 60);
        Human granny1 = new Human ("Marpl", false, 54);
        Human granny2 = new Human ("Melania", false, 52);

        Human dad = new Human ("Garry", true, 38, grandad1, granny1);
        Human mum = new Human ("Megan", false, 36, grandad2, granny2);

        Human son1 = new Human ("Bob", true, 16, dad, mum);
        Human daughter = new Human ("Britney", false, 12, dad, mum);
        Human son2 = new Human ("Barron", true, 8, dad, mum);

        Human [] human = new Human [] {grandad1, grandad2, granny1, granny2, dad,
                mum, son1, daughter, son2};
        for (Human h : human){
            System.out.println(h);
        }

    }
    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        // напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }

    }
}
