package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int amountPlus =0, amountMinus = 0;
        if (a>0) amountPlus++;
        if (b>0) amountPlus++;
        if (c>0) amountPlus++;
        if (a<0) amountMinus++;
        if (b<0) amountMinus++;
        if (c<0) amountMinus++;
        System.out.printf("количество отрицательных чисел: %d\n",amountMinus);
        System.out.printf("количество положительных чисел: %d\n",amountPlus);
    }
}
