package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i=0; i < 10; i++)
            arrayList.add(bufferedReader.readLine());
        int lessNum=arrayList.get(0).length(), moreNum=arrayList.get(0).length();
        for(String s : arrayList)
            if (s.length() < lessNum)
                lessNum = s.length();
        for(String s : arrayList)
            if (s.length() > moreNum)
                moreNum = s.length();
        //System.out.println(lessNum + "  " + moreNum);
        for(String s : arrayList)
            if (s.length() == lessNum || s.length() == moreNum) {
                System.out.println(s);
                break;
            }


    }
}
