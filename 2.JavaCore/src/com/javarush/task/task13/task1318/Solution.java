package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine().trim();
        bufferedReader.close();

        String filePath = "I:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1318\\";
        InputStream fileInputStream = new FileInputStream(filePath + fileName);
//        System.out.printf("File size: %d bytes \n", fileInputStream.available());

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            System.out.print((char) data);
        }
        System.out.println();

        fileInputStream.close();



    }


}

