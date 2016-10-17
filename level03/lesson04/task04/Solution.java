package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int i;
        int s=1;
        for (i=1; i<=10; i++)
        {
            s = s * i;
        }
        System.out.println(s);

    }
}