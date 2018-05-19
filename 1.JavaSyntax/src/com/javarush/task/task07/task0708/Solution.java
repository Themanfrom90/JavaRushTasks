package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++)
            strings.add(bufferedReader.readLine());
        int maxSize=0;
        for(String s : strings)
            if (s.length() > maxSize)
                maxSize = s.length();
        for(String s : strings)
            if (s.length() == maxSize)
                System.out.println(s);




    }
}
