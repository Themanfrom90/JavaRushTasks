package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] b = new int[3];
        for(int i=0; i<3; i++)
            b[i] = Integer.parseInt(bufferedReader.readLine());
        if (b[0] != b[1] && b[0] == b[2]) System.out.println(2);
        if (b[1] != b[2] && b[1] == b[0]) System.out.println(3);
        if (b[1] != b[0] && b[1] == b[2]) System.out.println(1);
    }
}
