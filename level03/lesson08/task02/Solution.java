package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        InputStream inputStream = System.in;

        Reader inputStreamReader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        String sMoney = bufferedReader.readLine(); //читаем строку с клавиатуры

        String sTime = bufferedReader.readLine(); //читаем строку с клавиатуры

        int nMoney = Integer.parseInt(sMoney); //преобразовываем строку в число.

        int nTime = Integer.parseInt(sTime);   //преобразовываем строку в число.

        System.out.println(name+" "+"получает"+ " "+nMoney+" "+"через"+" "+nTime+" "+"лет.");



    }
}

