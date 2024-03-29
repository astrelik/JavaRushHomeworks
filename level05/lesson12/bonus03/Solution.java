package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -100000;

        int iNum = Integer.parseInt(reader.readLine());
        if (iNum > 0){
            for (int i = 0; i < iNum; i++){
                int iMax = Integer.parseInt(reader.readLine());
                if (iMax > maximum){
                    maximum = iMax;
                }
            }

        } else {
            return;
        }

        System.out.println(maximum);
    }
}

