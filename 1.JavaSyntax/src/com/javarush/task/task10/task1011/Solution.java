package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        System.out.println(s);
        //напишите тут ваш код
        for (int i=0; i<39; i++) {
            s = s.substring(1,s.length());
            System.out.println(s);
        }
    }

}

