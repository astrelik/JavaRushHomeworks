package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n_line = null;

        String summa_line = "-1";

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

        System.out.print(x-1);
    }

}
