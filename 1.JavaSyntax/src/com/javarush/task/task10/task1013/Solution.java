package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name,surname,middlename;
        private int age,weight;
        private boolean sex;

        public Human(String name, String surname, String middlename, int age, int weight, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.middlename = middlename;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human (String name, String surname, int age, int weight, boolean sex) {
            this(name,surname,null,age,weight,sex);
        }

        public Human (String name, int age, int weight, boolean sex) {
            this(name,null,null,age,weight,sex);
        }
        public Human (String name,  int weight, boolean sex) {
            this(name,null,null,0,weight,sex);
        }
        public Human (String name, int age, int weight) {
            this(name,null,null,0,weight,true);
        }
        public Human (String name, String surname, String middlename) {
            this(name,surname,middlename,0,0,true);
        }
        public Human (String name, String surname) {
            this(name,surname,null,0,0,true);
        }
        public Human (String name) {
            this(name,null);
        }
        public Human (String name,int age) {
            this(name,age,0);
        }
        public Human (String name, String surname,int age) {
            this(name,surname, age,0,true);
        }
    }
}
