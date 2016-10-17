package com.javarush.test.level15.lesson12.home04;

/**
 * Created by strel on 13/09/2016.
 */
public class Sun implements Planet
{
    private static Sun sun = new Sun();

    private Sun()
    {
    }

    public static Sun getInstance()
    {
        return sun;
    }

}
