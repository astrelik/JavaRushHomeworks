package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Integer[] arr = new Integer[20];
        Integer[] arr1 = new Integer[10];
        Integer[] arr2 = new Integer[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
            arr2[i]=arr[i+10];
            System.out.println(arr2[i]);
        }


    }
}