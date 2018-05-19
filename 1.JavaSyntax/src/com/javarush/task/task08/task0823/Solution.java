package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

/*        //напишите тут ваш код
        String[] arrayOfString = s.trim().split(" +");
        char[] chars = {'z','x','c','v','b','n','m'}

        StringBuilder result = new StringBuilder();
        for (String anArrayOfString : arrayOfString){
            for (int i=0; i<anArrayOfString.length(); i++) {
                Character ch = anArrayOfString.charAt(i);
                if (ch)
            }
            result.append(anArrayOfString.replaceFirst("[^A-Za-z0-9]",
                    Character.toString(anArrayOfString.charAt(0))).append(" ");
        }
        System.out.println(result);*/
        String[] words= s.split("\\s+"); // Разбиение строки на слова с помощью разграничителя (пробел)
        String k;
        char n=' ';

        for(int i=0;i<words.length; i++){

            char[] chArray = words[i].toCharArray();

            for( int j=0;j<chArray.length; j++){
                if(chArray[j]!=' ')
                    n=Character.toUpperCase(chArray[j]);
                chArray[j]=n;
                break;
            }
            for( int j=0; j<chArray.length; j++)
                System.out.print(chArray[j]);

            System.out.print(" ");

        }
    }
}
