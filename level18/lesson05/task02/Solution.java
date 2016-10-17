package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static int count = 0;
    public static void main(String[] args){
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileName = new FileInputStream(reader.readLine());

            int bytes = 0;
            while (fileName.available() > 0)
            {
                bytes = fileName.read();
                if (bytes == 44)
                {
                    count++;
                }
            }

            System.out.println(count);
            fileName.close();
            reader.close();

        }catch (Exception fail){
        }
    }
}