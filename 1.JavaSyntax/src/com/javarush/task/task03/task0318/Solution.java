package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;


import static java.lang.System.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader buff = new BufferedReader(inputStreamReader);
        String number = buff.readLine();
        String name = buff.readLine();

        int num = Integer.parseInt(number);
        System.out.printf("%s захватит мир через %d лет. Му-ха-ха!",name,num);

    }
}
