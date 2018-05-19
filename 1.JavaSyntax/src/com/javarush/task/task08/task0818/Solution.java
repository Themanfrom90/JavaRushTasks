package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Random random = new Random();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
            map.put("key "+i,random.nextInt(1000));
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
            if (iterator.next().getValue() < 500)
                iterator.remove();
    }

    public static void main(String[] args) {
/*        HashMap<String,Integer> map = createMap();
        System.out.println(map);
        removeItemFromMap(map);
        System.out.println(map);*/
    }
}