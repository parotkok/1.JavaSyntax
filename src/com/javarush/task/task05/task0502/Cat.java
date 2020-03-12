package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/
/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.

Требования:
Класс Cat должен содержать конструктор без параметров.
Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
В классе Cat должен быть метод fight.
В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
 */

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat){
        int thisPoints=0;
        int anotherPoints=0;

        if (this.strength>anotherCat.strength)
            thisPoints+=3;
        else {
            if (this.strength!=anotherCat.strength) anotherPoints+=3;
        }

        if (this.age>anotherCat.age)
            thisPoints+=3;
        else {
            if (this.age!=anotherCat.age)anotherPoints+=3;
        }

        if (this.weight>anotherCat.weight)
            thisPoints+=3;
        else {
            if (this.weight!=anotherCat.weight)anotherPoints+=3;
        }
        System.out.println(this.hashCode()+" "+anotherCat.hashCode());
        if (thisPoints==anotherPoints)
            return this.hashCode()>anotherCat.hashCode();
        else {
            return thisPoints>anotherPoints;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 4;
        cat1.strength = 6;
        Cat cat2 = new Cat();
        cat2.age = 5;
        cat2.weight = 4;
        cat2.strength = 6;
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

}
