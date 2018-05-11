package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = bufferedReader.readLine();
        int num = Integer.parseInt(sNum);
        if (num >=1 && num <= 999) {
            if (sNum.length() == 1 && num%2==0) System.out.println("четное однозначное число");
            if (sNum.length() == 1 && num%2!=0) System.out.println("нечетное однозначное число");
            if (sNum.length() == 2 && num%2==0) System.out.println("четное двузначное число");
            if (sNum.length() == 2 && num%2!=0) System.out.println("нечетное двузначное число");
            if (sNum.length() == 3 && num%2==0) System.out.println("четное трехзначное число");
            if (sNum.length() == 3 && num%2!=0) System.out.println("нечетное трехзначное число");
        }

    }
}
