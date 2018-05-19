package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); ) {
            if (hasLetter(list.get(i), 'л'))
                if (!hasLetter(list.get(i), 'р')) {
                    list.add(i, list.get(i));
                    i++;
                }
                else;
            else if (hasLetter(list.get(i),'р')) {
                list.remove(i);
                i--;
            }
            i++;
        }
        return list;
    }

    public static boolean hasLetter(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                return true;
        }
        return false;
    }
}