package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        int sum = 0,a;

        while ( ( a = Integer.parseInt(bufferedReader.readLine())) != -1 )
            sum += a;
        sum += a;
        System.out.println(sum);
    }
}
