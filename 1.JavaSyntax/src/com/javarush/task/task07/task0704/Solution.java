package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++)
            array[i] = Integer.parseInt(bufferedReader.readLine());
        for (int i=9; i>=0; i--)
            System.out.println(array[i]);
    }
}

