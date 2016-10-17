package com.javarush.test.level15.lesson12.home04;

/**
 * Created by strel on 13/09/2016.
 */
public class Earth implements Planet
{
    private static Earth earth = new Earth();

    private Earth()
    {
    }

    public static Earth getInstance()
    {
        return earth;
    }
}
