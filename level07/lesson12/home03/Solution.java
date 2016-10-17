package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        int min = min(array);
        System.out.println(max);
        System.out.println(min);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
        int[] numbers = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i]=Integer.parseInt(reader.readLine());
        }
        return numbers;
    }

    public static int max(int[] array) {
        //Найдите максимальное значение в этом методе
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max) max = array[i];

        }
        return max;
    }

    public static int min(int[] array) {
        //Найдите минимальное значение в этом методе
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min) min = array[i];

        }
        return min;
    }


}
