package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum, buff;

        //напишите тут ваш код

        //System.out.print("Введите количество повторений: ");
        int num = Integer.parseInt(reader.readLine());
        //System.out.println("Введите числа:");
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<num-1; i++){
            buff = Integer.parseInt(reader.readLine());
            if (maximum < buff) maximum = buff;
        }

        System.out.println(maximum);
    }
}
