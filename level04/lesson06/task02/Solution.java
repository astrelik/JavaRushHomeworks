package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader ax= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(ax.readLine());
        int b =Integer.parseInt(ax.readLine());
        int c =Integer.parseInt(ax.readLine());
        int d =Integer.parseInt(ax.readLine());
        if (a > b && a > c && a > d) System.out.print(a);
        else if (b > a && b > c && b > d) System.out.print(b);
        else if (c > a && c > b && c > d) System.out.print(c);
        else  System.out.print(d);

    }
}
