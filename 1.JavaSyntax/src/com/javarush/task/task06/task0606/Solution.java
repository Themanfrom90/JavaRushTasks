package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = bufferedReader.readLine();
        char c;
        for (int i=0; i<sNumber.length(); i++) {
            c = Character.valueOf(sNumber.charAt(i));
            if (c%2 == 0)
                even++;
            else odd++;
        }

        System.out.printf("Even: %d Odd: %d",even,odd);
    }

}
