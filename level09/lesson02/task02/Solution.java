package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method2()
    {
        method3();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method3()
    {
        method4();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method4()
    {
        method5();
        //напишите тут ваш код
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }

    public static String method5()
    {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
        String meth = stackTraceElement[2].getMethodName();
        System.out.println(meth);
        return meth;
    }
}
