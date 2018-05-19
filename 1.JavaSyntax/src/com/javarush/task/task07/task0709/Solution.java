package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++)
            arrayList.add(bufferedReader.readLine());
        int minNum=0;
        if (arrayList.get(1).length() != 0)
            minNum=arrayList.get(1).length();
        for(String s : arrayList)
            if (s.length()<minNum)
                minNum = s.length();
        for(String s : arrayList)
            if (s.length() == minNum)
                System.out.println(s);
    }
}
