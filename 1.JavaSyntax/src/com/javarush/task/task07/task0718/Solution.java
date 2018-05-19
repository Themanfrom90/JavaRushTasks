package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            arrayList.add(bufferedReader.readLine());
        int prove = isSorted(arrayList);
        if (prove != -5)
            System.out.println(prove);

    }
        public static int isSorted(ArrayList<String> list) {
            for (int i=1; i<list.size(); i++) {
                if (list.get(i).length() < list.get(i-1).length())
                    return i;
            }
            return -5;
        }


}

