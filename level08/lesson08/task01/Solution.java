package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> words = new HashSet<String>();
        words.add("Лила");
        words.add("Люда");
        words.add("Лора");
        words.add("Люк");
        words.add("Ллейс");
        words.add("Лайка");
        words.add("Ложка");
        words.add("Лимон");
        words.add("Лопух");
        words.add("Лизун");
        words.add("Люс");
        words.add("Лама");
        words.add("Лаунч");
        words.add("Лира");
        words.add("Лада");
        words.add("Лампочка");
        words.add("Люстра");
        words.add("Лиса");
        words.add("Лань");
        words.add("Лорд");
      return words;
    }
}
