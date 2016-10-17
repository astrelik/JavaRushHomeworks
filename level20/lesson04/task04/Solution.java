package com.javarush.test.level20.lesson04.task04;

/* Как сериализовать static?
Сделайте так, чтобы сериализация класса ClassWithStatic была возможной
*/

import java.io.Serializable;

public class Solution {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "it's test static string";
        public int i;
        public int j;
    }
}
