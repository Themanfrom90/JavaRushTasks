package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> result = new HashMap<>();
        for (int i = 0; i < 7; i++)
            result.put("Surname " + i, "Name " + i);
        result.put("Surname " + 1, "Name " + 6);
        result.put("Surname " + 2, "Name " + 5);
        result.put("Surname " + 2, "Name " + 4);

        return result;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
