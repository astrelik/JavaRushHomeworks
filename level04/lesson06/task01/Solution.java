package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader ax= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(ax.readLine());
        int b =Integer.parseInt(ax.readLine());
        if (a > b) System.out.print(b);
        else System.out.print(a);

    }
}