package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public void initialize (int left, int top, int width, int height) {
        this.height = height;
        this.left = left;
        this.width = width;
        this.top = top;
    }

    public void initialize (int left, int top) {
        this.height = 0;
        this.left = left;
        this.width = 0;
        this.top = top;
    }
    public void initialize (int left, int top, int width) {
        this.height = 0;
        this.left = left;
        this.width = width;
        this.top = top;
    }
    public void initialize (Rectangle rectangle) {
        this.height = rectangle.height;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.top = rectangle.top;
    }

    public static void main(String[] args) {

    }
}
