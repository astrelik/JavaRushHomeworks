package com.javarush.test.level06.lesson11.bonus01;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        int a = Integer.parseInt(A);
        String B = reader.readLine();
        int b = Integer.parseInt(B);

        max = a > b ? a : b;

        System.out.println("Max is " + max);
    }

}
