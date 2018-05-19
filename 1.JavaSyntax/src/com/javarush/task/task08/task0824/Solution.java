package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        ArrayList<Human> arrayList = new ArrayList<>();
        arrayList.add(child1);
        arrayList.add(child2);
        arrayList.add(child3);

        Human father = new Human("Father",true,35,arrayList);
        Human mother = new Human("Mother",false,33,arrayList);

        ArrayList<Human> arrayParents1 = new ArrayList<>();
        ArrayList<Human> arrayParents2 = new ArrayList<>();
        arrayParents1.add(father);
        arrayParents2.add(mother);

        Human grandfather1 = new Human("GrandFather1",true,65,arrayParents1);
        Human grandfather2 = new Human("GrandFather2",true,70,arrayParents2);
        Human grandmother1 = new Human("GrandMother1",false,75,arrayParents1);
        Human grandmother2 = new Human("GrandMother2",false,72,arrayParents2);

        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandmother2.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human() {
            this("DefaultName",true,25,new ArrayList<>());
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
