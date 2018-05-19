package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны
*/

public class Solution {

    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<>();
        for (int i=1; i<7; i++)
            hashMap.put("" +i, "NeedToDeleteThisName");
        hashMap.put("7","ThisNameMustBeSaved");
        hashMap.put("8","ThisNameMustBeSavedToo");
        hashMap.put("9","ThisMustNotBeSaved");
        hashMap.put("10","ThisMustNotBeSaved");
        return hashMap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String,Integer> mapHelper = new HashMap<>();
        for (HashMap.Entry<String,String> pair : map.entrySet()) {
                mapHelper.put(pair.getValue(), 0);
        }
//        System.out.println(mapHelper);

        for (HashMap.Entry<String,String> pair : map.entrySet())
            mapHelper.put(pair.getValue(), mapHelper.get(pair.getValue())+1);
//        System.out.println(mapHelper);

        for (HashMap.Entry<String,Integer> pair : mapHelper.entrySet())
            if (pair.getValue() > 1)
                removeItemFromMapByValue(map,pair.getKey());
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String,String> map = createMap();
////        System.out.println(map.size());
////        System.out.println(map);
//////        System.out.println(map.get("3456346"));
//        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }


}