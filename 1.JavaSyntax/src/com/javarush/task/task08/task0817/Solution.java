package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 8; i++)
            hashMap.put("Иванов" + i, "Ванес");
            hashMap.put("2134", "123");
            hashMap.put("2133", "123");

        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        //String name = "";
        //for (int i = 0; i < map.size(); i++)
            while (iterator.hasNext()) {
                removeItemFromMapByValue(map, iterator.next().getValue());

/*                while (iterator.hasNext())
                    if (iterator.next().getValue().equals(name))
                        iterator.remove();*/
            }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashMap = createMap();
        System.out.println(hashMap);
        removeTheFirstNameDuplicates(hashMap);
        System.out.println(hashMap);
    }
}
