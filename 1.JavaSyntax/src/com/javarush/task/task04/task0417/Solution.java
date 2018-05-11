package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if (a == b && a == c) System.out.printf("%d %d %d",a,b,c);
        else if (a == b) System.out.printf("%d %d",a,b);
        else if (c == b) System.out.printf("%d %d",c,b);
        else if (a == c) System.out.printf("%d %d",a,c);
    }
}