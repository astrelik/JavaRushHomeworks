package com.javarush.test.level09.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Cat> map = new HashMap<String, Cat>();
        Cat cat1= new Cat("Murzik1"); map.put("Murzik1",cat1);
        Cat cat2= new Cat("Murzik2"); map.put("Murzik2",cat2);
        Cat cat3= new Cat("Murzik3"); map.put("Murzik3",cat3);
        Cat cat4= new Cat("Murzik4"); map.put("Murzik4",cat4);
        Cat cat5= new Cat("Murzik5"); map.put("Murzik5",cat5);
        Cat cat6= new Cat("Murzik6"); map.put("Murzik6",cat5);
        Cat cat7= new Cat("Murzik7"); map.put("Murzik7",cat7);
        Cat cat8= new Cat("Murzik8"); map.put("Murzik8",cat8);
        Cat cat9= new Cat("Murzik9"); map.put("Murzik9",cat9);
        Cat cat0= new Cat("Murzik0"); map.put("Murzik0",cat0);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String,Cat> pair: map.entrySet() ) {
            Cat a = pair.getValue();
            cats.add(a);
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
