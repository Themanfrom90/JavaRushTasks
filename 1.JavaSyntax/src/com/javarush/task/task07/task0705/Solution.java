package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array20 = new int[20];
        int[] array10 = new int[10];
        int[] array11 = new int[10];

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            array20[i] = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < 20; i++)
            if (i < 10)
                array10[i] = array20[i];
            else array11[i - 10] = array20[i];
        for (int i : array11)
            System.out.println(i);
    }
}
