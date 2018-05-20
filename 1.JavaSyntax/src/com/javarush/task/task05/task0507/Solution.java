package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0, kol=0,a;
        double sa=0;
        while ( (a = Integer.parseInt(bufferedReader.readLine())) != -1) {
            sum += a;
            //System.out.println(sum += a);
            kol++;
            //System.out.println(kol);
        }
        if (kol != 0) {


            sa = sum / (double)kol;
            System.out.println(sa);
        }
    }
}

