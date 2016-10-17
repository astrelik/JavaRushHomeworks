package com.javarush.test.level15.lesson12.home04;

/**
 * Created by strel on 13/09/2016.
 */
public class Moon implements Planet
{

    private static Moon moon = new Moon();

    private Moon()
    {
    }

    public static Moon getInstance()
    {
        return moon;
    }
}
