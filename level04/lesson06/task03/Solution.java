package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int max = 0, mid = 0, min = 0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1=reader.readLine();
        int n1=Integer.parseInt(s1);
        String s2=reader.readLine();
        int n2=Integer.parseInt(s2);
        String s3=reader.readLine();
        int n3=Integer.parseInt(s3);

        if (n1 >= n2 && n1 >= n3)
        {
            max = n1;
            if (n3 >= n2)
            {
                mid = n3;
                min = n2;
            }
            else
            {
                mid = n2;
                min = n3;}
        }
        else if (n2 >= n1 && n2 >= n3)
        {
            max = n2;
            if (n3 >= n1)
            {
                mid = n3;
                min = n1;
            }
            else
            {
                mid = n1;
                min = n3;
            }
        }
        else if (n3 >= n1 && n3 >= n2)
        {
            max = n3;
            if (n2 >= n1)
            {
                mid = n2;
                min = n1;
            }
            else
            {
                mid = n1;
                min = n2;
            }
        }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
