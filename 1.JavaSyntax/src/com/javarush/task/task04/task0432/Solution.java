package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String something = bufferedReader.readLine();
        int N = Integer.parseInt(bufferedReader.readLine());
        int i =0;
        while (i<N) {
            System.out.println(something);
            i++;
        }

    }
}
