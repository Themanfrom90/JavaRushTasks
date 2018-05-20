package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String enteredWords = bufferedReader.readLine().trim();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        for (int i = 0; i < enteredWords.length(); i++)
            if (!Character.toString(enteredWords.charAt(i)).equals(" "))
                characterArrayList.add(enteredWords.charAt(i));
        ArrayList<Character> glasnye = new ArrayList<>();
        ArrayList<Character> soglasnye = new ArrayList<>();
        for (char ch : characterArrayList)
            if (isVowel(ch))
                glasnye.add(ch);
            else soglasnye.add(ch);
        for (char ch : glasnye)
            System.out.printf("%c ", ch);
        System.out.println();
        for (char ch : soglasnye)
            System.out.printf("%c ", ch);
        System.out.println();
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}