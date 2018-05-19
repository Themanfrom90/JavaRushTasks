package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

/*        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }*/

        ArrayList<String> listEvenOddLength = new ArrayList<>();
        for (int i = 0 ; i<list.size(); i++) {
            if (list.get(i).length() %2 == 0)
                listEvenOddLength.add(i,twoStrings(list.get(i)));
            else listEvenOddLength.add(i,threeStrings(list.get(i)));
        }

        for (int i = 0; i < listEvenOddLength.size(); i++) {
            System.out.println(listEvenOddLength.get(i));
        }


    }
    public static String twoStrings(String string) {
        return string + " " + string;
    }

    public static String threeStrings(String string) {
        return string + " " + string + " " + string;
    }
}
