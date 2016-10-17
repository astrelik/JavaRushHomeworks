package com.javarush.test.level27.lesson15.big01.kitchen;

/**
 * Created by strel on 26/09/2016.
 */
import com.javarush.test.level27.lesson15.big01.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by
 * Polurival on 04.03.2016.
 */
public class Waitor implements Observer
{
    @Override
    public void update(Observable cook, Object order)
    {
        ConsoleHelper.writeMessage(order + " was cooked by " + cook);
    }
}
