package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n_line = null;

        String summa_line = "сумма";

        int x = 0;

        Boolean s_line = false;

        while (s_line != true){
            n_line = reader.readLine();
            s_line = n_line.equals(summa_line);
            if (s_line != true) {
                int n = Integer.parseInt(n_line);
                x = x + n;
            }
        }

        System.out.print(x);
    }
}
