package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man Vova = new Man("Vova",35,"Street1");
        Woman Masha = new Woman("Masha",33,"Street2");
        //выведи их на экран тут
        System.out.println(Vova);
        System.out.println(Masha);
    }

    public static class Man
    {
        public String name;
        public int age;
        public String address;
        public String toString() {
            return "name + \" \" + age + \" \" + address";
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

    public static  class Woman
    {
        public String name;
        public int age;
        public String address;
        public String toString() {
            return "name + \" \" + age + \" \" + address";
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}








