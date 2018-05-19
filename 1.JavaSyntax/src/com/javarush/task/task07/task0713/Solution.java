package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> arrayOther = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            if (arrayList.get(i)%3 == 0)
                array3.add(arrayList.get(i));
            if (arrayList.get(i)%2 == 0)
                array2.add(arrayList.get(i));
            if (!(arrayList.get(i)%3 == 0) && !(arrayList.get(i)%2 == 0))
                arrayOther.add(arrayList.get(i));
        }
        printList(array3);
        printList(array2);
        printList(arrayOther);


    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for(Integer i : list) {
            System.out.println(i);
        }
    }
}
