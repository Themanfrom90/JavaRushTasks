package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(bufferedReader.readLine());
        t %= 5;
        if (t >= 4) System.out.println("красный");
        else if (t >= 3) System.out.println("жёлтый");
        else System.out.println("зелёный");
    }
}