package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] array = new int [20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Random random = new Random();
        for(int i=0; i<20; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
            //array[i] = random.nextInt(100);
        }
        //print(array);
        return array;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max=array[0];
        for (int i=1; i<20; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

/*    public static void print(int[] array) {
        for (int i : array) System.out.println(i);
    }*/
}
