package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX;
    int centerY;
    double radius;
    double width;
    String color;

    public void initialize(int centerX, int centerY, double radius )
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, double radius, double width )
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, double radius, double width, String color )
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }




}
