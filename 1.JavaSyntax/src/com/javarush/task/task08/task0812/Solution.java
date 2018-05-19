package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<>();
        int dlina = 1, dlinamax = 1;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
            if (i > 0 && arrayList.get(i).equals(arrayList.get(i - 1))) {
                dlina++;
                if (dlina > dlinamax)
                    dlinamax = dlina;
            } else {
                if (dlina > dlinamax)
                    dlinamax = dlina;
                dlina = 1;
            }
        }
        System.out.println(dlinamax);

    }
}