package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static ArrayList<Integer> charsAmount = new ArrayList<Integer>();
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char anAbcArray : abcArray) {
            alphabet.add(anAbcArray);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.trim().toLowerCase());
        }

        // напишите тут ваш код
        ArrayList<Integer> charsAmount = new ArrayList<Integer>();
        for (Integer buf : charsAmount) {
            charsAmount.add(0);
        }
        for (String s : list)
            for (int i = 0; i < s.length(); i++)
                charsAmount.add(alphabet.indexOf(s.charAt(i)),charsAmount.get(alphabet.indexOf(s.charAt(i)))+1);



/*        HashMap<Character, Integer> charsAmount = new HashMap<Character, Integer>();
        for (Character ch : alphabet)
            charsAmount.put(ch, 0);

        for (String s : list)
            for (int i = 0; i < s.length(); i++)
                charsAmount.put(s.charAt(i), charsAmount.get(s.charAt(i)) + 1);

        for (HashMap.Entry<Character,Integer> pair : charsAmount.entrySet())
            System.out.printf("%s %d\n",pair.getKey(),pair.getValue());*/

    }

}
