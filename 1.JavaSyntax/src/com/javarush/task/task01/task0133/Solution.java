package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSecondsAfter15(12345));
    }

    public static int getSecondsAfter15(int secondsAfter12) {
        int secondsAfter15;
        //напишите тут ваш код

        return secondsAfter12 - 3600*3;
    }
}