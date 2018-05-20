package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String buff = "";
        int a=0;
        while (!((buff = bufferedReader.readLine()).equals ("сумма"))) {
            a += Integer.parseInt(buff);
            //stringBuffer.delete(0,stringBuffer.length());
        }
        System.out.println(a);


    }
}
