package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        Integer iNum = number;
        String sNum = iNum.toString();
        return Character.getNumericValue(sNum.charAt(0)) + Character.getNumericValue(sNum.charAt(1)) + Character.getNumericValue(sNum.charAt(2));
    }
}