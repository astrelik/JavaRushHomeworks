package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader ax= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(ax.readLine());
        int b =Integer.parseInt(ax.readLine());
        int c =Integer.parseInt(ax.readLine());

        if (a < b && b < c )
            System.out.println(b);
        if (b < a && a < c)
            System.out.println(a);
        if (a < c && c < b)
            System.out.println(c);
        if (b < c && c < a)
            System.out.println(c);
        if (c < a && a < b)
            System.out.println(a);
        if (c < b && b < a)
            System.out.println(b);

    }
}
