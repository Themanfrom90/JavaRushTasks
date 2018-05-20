package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {

    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat();
        cats.add(cats.size(),cat1);
        Cat cat2 = new Cat();
        cats.add(cats.size(),cat2);
        Cat cat3 = new Cat();
        cats.add(cats.size(),cat3);
        Cat cat4 = new Cat();
        cats.add(cats.size(),cat4);
        Cat cat5 = new Cat();
        cats.add(cats.size(),cat5);
        Cat cat6 = new Cat();
        cats.add(cats.size(),cat6);
        Cat cat7 = new Cat();
        cats.add(cats.size(),cat7);
        Cat cat8 = new Cat();
        cats.add(cats.size(),cat8);
        Cat cat9 = new Cat();
        cats.add(cats.size(),cat9);
        Cat cat10 = new Cat();
        cats.add(cats.size(),cat10);
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for(int i=0; i<cats.size(); i++)
            System.out.println(cats.get(i));
    }
}
