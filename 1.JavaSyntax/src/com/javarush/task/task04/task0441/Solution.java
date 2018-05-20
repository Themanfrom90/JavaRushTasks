package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ((a == b && a == c) || ((b == a) || a == c))
            System.out.println(a);
        else if ((a == b || b == c))
            System.out.println(b);
        else {
            if ((a > b && b > c) || (c > b && b > a))
                System.out.println(b);
            if ((a > c && c > b) || (b > c && c > a))
                System.out.println(c);
            if ((b > a && a > c) || (c > a && a > b))
                System.out.println(a);
        }


    }
}
