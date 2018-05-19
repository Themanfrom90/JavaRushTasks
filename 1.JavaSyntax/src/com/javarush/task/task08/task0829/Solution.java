package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
/*        List<String> addresses = new ArrayList<String>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }*/
        HashMap<String,String> addressesMap = new HashMap<>();
        String bufferCity = reader.readLine();
        String bufferSurname = reader.readLine();
        addressesMap.put(bufferCity,bufferSurname);
        while(!bufferCity.equals("")) {
            bufferCity = reader.readLine();
            if (!bufferCity.isEmpty())
                bufferSurname = reader.readLine();
            addressesMap.put(bufferCity,bufferSurname);
        }
        bufferCity = reader.readLine();
        System.out.println(addressesMap.get(bufferCity));
    }
}
