package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("AUGUST 1 1980"));
        map.put("Stallone6", new Date("JANUARY 1 1980"));
        map.put("Stallone7", new Date("FEBRUARY 1 1980"));
        map.put("Stallone8", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone9", new Date("NOVEMBER 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int lol = iterator.next().getValue().getMonth();
            if ( lol >4 && lol < 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) {
/*        HashMap<String, Date> hashMap = createMap();
        for (HashMap.Entry<String,Date> pair : hashMap.entrySet())
            System.out.println(pair.getValue());
        removeAllSummerPeople(hashMap);
        System.out.println();
        for (HashMap.Entry<String,Date> pair : hashMap.entrySet())
            System.out.println(pair.getValue());*/
    }
}
