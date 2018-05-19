package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<String,Integer> monthMap = new HashMap<>();
        monthMap.put("january",1);
        monthMap.put("february",2);
        monthMap.put("march",3);
        monthMap.put("april",4);
        monthMap.put("may",5);
        monthMap.put("june",6);
        monthMap.put("july",7);
        monthMap.put("august",8);
        monthMap.put("september",9);
        monthMap.put("october",10);
        monthMap.put("november",11);
        monthMap.put("december",12);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String month = bufferedReader.readLine();
        System.out.printf("%s is the %d month",month,monthMap.get(month.toLowerCase()));


    }
}
