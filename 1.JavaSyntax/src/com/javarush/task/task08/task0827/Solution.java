package com.javarush.task.task08.task0827;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("MARCH 2 1988"));
        System.out.println(isDateOdd("AUGUST 2 1900"));
    }

    public static boolean isDateOdd(String date) {
        boolean result = true;
        Date calculateDate = new Date(date);
        int dayAmount = 0;
        int month = calculateDate.getMonth()+1;
        int day = calculateDate.getDate();
        int year = calculateDate.getYear()+1900;
//        System.out.println("год: " + year);
//        System.out.println("месяц: " + month);
//        System.out.println("день: " + day + "\n");
        HashMap<Integer, Integer> daysInMonth = new HashMap<>();
        daysInMonth.put(1, 31);
        daysInMonth.put(2, 28);
        daysInMonth.put(3, 31);
        daysInMonth.put(4, 30);
        daysInMonth.put(5, 31);
        daysInMonth.put(6, 30);
        daysInMonth.put(7, 31);
        daysInMonth.put(8, 31);
        daysInMonth.put(9, 30);
        daysInMonth.put(10, 31);
        daysInMonth.put(11, 30);
        daysInMonth.put(12, 31);
//        System.out.println("Дней в феврале " + daysInMonth.get(2));
        if ((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0)));
            daysInMonth.put(2, 29);

//        System.out.println("Дней в феврале " + daysInMonth.get(2));
        for (HashMap.Entry<Integer, Integer> pair : daysInMonth.entrySet())
            if (pair.getKey() < month) {
                dayAmount += pair.getValue();
//                System.out.print(dayAmount + " ");
            }
        dayAmount += day;
//        System.out.print(dayAmount + " \n");
        if (dayAmount % 2 == 0)
            result = false;
        return result;
    }
}
