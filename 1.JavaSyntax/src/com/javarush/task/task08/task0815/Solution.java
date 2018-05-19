package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hasMap = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            if (i < 3)
                hasMap.put("Иванов" + i, "Пётр" + i);
            else if (i<6)
                hasMap.put("Иванов"+i, "Колян");
            else hasMap.put("123"+i,"321");
        }
        return hasMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            if (iterator.next().getValue().equals(name))
                count++;
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            if (iterator.next().getKey().equals(lastName))
                count++;
        return count;

    }

    public static void main(String[] args) {
/*        HashMap<String, String> hashMap = createMap();
        System.out.println(hashMap);
        System.out.println(getCountTheSameFirstName(hashMap, "321"));
        System.out.println(getCountTheSameLastName(hashMap, "Иванов4"));*/
    }
}
