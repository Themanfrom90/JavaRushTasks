package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human("дед Женя",true,60);
        Human ded2 = new Human("дед Коля",true,58);
        Human baba1 = new Human("баба Клава",false,59);
        Human baba2 = new Human("баба Женя",false,63);

        Human father = new Human("папа Ваня",true,33,ded1,baba1);
        Human mother = new Human("мама Василиса",false,31,ded2,baba2);

        Human child1 = new Human("Кирилл",true,14,father,mother);
        Human child2 = new Human("Аня",false,13,father,mother);
        Human child3 = new Human("Филипп",true,9,father,mother);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex,int age){
            this(name,sex,age,null,null);
        }

        public Human(String name, boolean sex,int age,Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















