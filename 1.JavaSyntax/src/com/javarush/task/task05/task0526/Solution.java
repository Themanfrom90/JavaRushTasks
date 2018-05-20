package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man1 = new Man("Gogi",15,"Moscow");
        Man man2 = new Man("Migi",18,"St.Piter");

        Woman woman1 = new Woman("Becki", 19, "London");
        Woman woman2 = new Woman("Dobli", 39, "York");

        System.out.printf("%s %d %s\n%s %d %s\n%s %d %s\n%s %d %s\n",
                man1.name, man1.age, man1.address,
                man2.name,man2.age,man2.address,
                woman1.name,woman1.age,woman1.address,
                woman2.name,woman2.age,woman2.address);
    }

    public static class Man {
        String name;
        String address;
        int age;

        public Man (String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    public static class Woman {
        String name;
        String address;
        int age;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }
    }

    //напишите тут ваш код
}
