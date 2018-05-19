package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i=0; i<5; i++)
            arrayList.add(bufferedReader.readLine());
        String s;
        for (int i=0; i<13; i++) {
            s = arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            arrayList.add(0,s);
        }
        for(String s1 : arrayList)
            System.out.println(s1);





    }
}
