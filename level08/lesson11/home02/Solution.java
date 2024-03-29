package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть.
   Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i=0;i<4;i++) result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();

        //напишите тут ваш код
        for (int i=0;i<3;i++) result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> result = new HashSet<Object>();
        for (Cat cat : cats) result.add(cat);
        for (Dog dog : dogs) result.add(dog);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        for (Cat s : cats) pets.remove(s);
    }

    public static void printPets(Set<Object> pets)
    {
        //напишите тут ваш код
        System.out.println("");
        for (Object s : pets) System.out.println(s);
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
