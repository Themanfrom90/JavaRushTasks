package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.printf("%s: %s: %s\n",stackTraceElements[2].getClassName(),stackTraceElements[2].getMethodName(),s);
//        for (StackTraceElement st : stackTraceElements) {
//            System.out.println(st.getClassName());
//            System.out.println(st.getMethodName());
//            System.out.println(s);
//            System.out.println();
//        }
    }
}
