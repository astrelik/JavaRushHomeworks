package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int n = 12;
        Integer N = 5;
        System.out.println(print(n));
        System.out.println(print(N));
    }

    //Напишите тут ваши методы
    public static int print(int n)
    {
        return n;
    }
    public static Integer print (Integer N){
        return N;
    }
}
