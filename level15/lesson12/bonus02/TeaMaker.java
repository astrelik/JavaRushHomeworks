package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by strel on 13/09/2016.
 */
public class TeaMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для чая");
    }
    void putIngredient()
    {
        System.out.println("Насыпаем чай");
    }
    void pour () {
        System.out.println("Заливаем водой");
    }
}
