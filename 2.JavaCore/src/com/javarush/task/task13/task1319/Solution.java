package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt", filePath = "I:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task13\\task1319\\";
        FileInputStream fileInputStream = new FileInputStream(filePath + fileName);

        while (fileInputStream.available() > 0 ) {
            int data = fileInputStream.read();
            System.out.print((char) data);
        }

        fileInputStream.close();

    }
}
