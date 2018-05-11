package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            b[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int j = 0; j < 3; j++)
            for (int i = 2; i >0; i--)
                if (b[i] > b[i - 1]) {
                    b[i] += b[i - 1];
                    b[i - 1] = b[i] - b[i - 1];
                    b[i] = b[i] - b[i - 1];

                }
        System.out.printf("%d %d %d", b[0], b[1], b[2]);
    }
}
