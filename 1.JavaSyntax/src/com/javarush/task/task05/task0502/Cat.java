package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean fl1 = true;
        if (this.strength > anotherCat.strength && this.weight > anotherCat.weight)
            fl1 = true;
        else if (this.strength < anotherCat.strength && this.weight < anotherCat.weight)
            fl1 = false;
        else if (this.strength == anotherCat.strength && this.weight == anotherCat.weight)
            if (this.age < anotherCat.age)
                fl1 = true;
            else if (this.age > anotherCat.age)
                fl1 = false;
            else if (this.age == anotherCat.age)
                if (this.name.length() > anotherCat.name.length())
                    fl1 = true;
                else if (this.name.length() < anotherCat.name.length())
                    fl1 = false;
                else if (this.name.length() < anotherCat.name.length())
                    fl1 = true;
        return fl1;

    }

    public static void main(String[] args) {

    }
}
