package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Formando on 31-08-2016.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 47;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
