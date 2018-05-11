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
        if (a == b && a == c) System.out.println(a);
        else if (b == max(a,min(b,c))) System.out.println(b);
        else if (a == max(b,min(a,c))) System.out.println(a);
        else if (c == max(c,min(a,b))) System.out.println(c);

    }

    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }


}
