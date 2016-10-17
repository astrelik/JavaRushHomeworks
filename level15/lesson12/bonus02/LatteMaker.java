package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by strel on 13/09/2016.
 */
public class LatteMaker extends DrinkMaker
{
    @Override
    void getRightCup()
    {
        System.out.println("Берем чашку для латте");
    }
    void pour () {
        System.out.println("Заливаем молоком с пенкой");
    }
    void putIngredient()
    {
        System.out.println("Делаем кофе");
    }

}
