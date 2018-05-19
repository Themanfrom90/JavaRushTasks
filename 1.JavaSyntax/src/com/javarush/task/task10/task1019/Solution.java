package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


//        System.out.println("Id=" + id + " Name=" + name);
        HashMap<String, Integer> hashMap = new HashMap<>();
        try {
            int id = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            if (name.length() != 0)
                while (name.length() != 0) {
                    hashMap.put(name, id);
                    id = Integer.parseInt(reader.readLine());
                    name = reader.readLine();
                    if (name.length() == 0)
                        hashMap.put("",id);
                }
            for (HashMap.Entry<String, Integer> pair : hashMap.entrySet())
                System.out.printf("%d %s\n", pair.getValue(), pair.getKey());
        } catch (NumberFormatException e) {
            for (HashMap.Entry<String, Integer> pair : hashMap.entrySet())
                System.out.printf("%d %s\n", pair.getValue(), pair.getKey());
        }

    }
}
