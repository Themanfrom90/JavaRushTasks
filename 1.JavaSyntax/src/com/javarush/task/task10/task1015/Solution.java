package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayStringList = new ArrayList[3];
        arrayStringList[0] = new ArrayList<String>();
        arrayStringList[1] = new ArrayList<String>();
        arrayStringList[2] = new ArrayList<String>();
        arrayStringList[0].add("1");
        arrayStringList[1].add("2");
        arrayStringList[2].add("3");
        arrayStringList[0].add("1-2");
        arrayStringList[1].add("2-2");
        arrayStringList[2].add("3-3");


        return arrayStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}