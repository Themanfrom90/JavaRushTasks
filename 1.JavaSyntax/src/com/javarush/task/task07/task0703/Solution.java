package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++) {
            arrayString[i] = bufferedReader.readLine();
        }

        for (int i=0; i<10; i++) {
            arrayInt[i] = arrayString[i].length();
        }

        for (int i:arrayInt) System.out.println(i);




    }
}
