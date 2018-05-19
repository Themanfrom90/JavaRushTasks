package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        System.out.println(numbers);
        for (int i = 0; i < abcArray.length; i++) {
            numbers.add(0);
        }
//        System.out.println(numbers);

        // напишите тут ваш код
//        System.out.println(alphabet);
        for (String s : list)
            for (int i = 0; i < s.length(); i++) {
                if (alphabet.contains(s.charAt(i)))
                    numbers.set(alphabet.indexOf(s.charAt(i)), numbers.get(alphabet.indexOf(s.charAt(i))) + 1);
            }
        for (int i = 0; i < numbers.size(); i++)
            if (i < numbers.size() - 1)
                System.out.printf("%s %d\n", alphabet.get(i), numbers.get(i));
            else System.out.printf("%s %d", alphabet.get(i), numbers.get(i));

    }
}
