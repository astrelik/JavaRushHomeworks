package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
import java.util.ArrayList;
public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        // создаем, инициализируем
        Human son1 = new Human("son Michael", true, 10, new ArrayList<Human>());
        Human son2 = new Human("son Jonathan", true, 11, new ArrayList<Human>());
        Human son3 = new Human("son Tom", true, 12, new ArrayList<Human>());
        ArrayList<Human> childrenArray= new ArrayList<Human>();
        childrenArray.add(son1);
        childrenArray.add(son2);
        childrenArray.add(son3);

        Human father = new Human("father Mathew", true, 35, childrenArray);
        Human mother = new Human("mother Sarah", false, 35, childrenArray);
        ArrayList<Human> parent1 = new ArrayList<Human>();
        ArrayList<Human> parent2 = new ArrayList<Human>();
        parent1.add(father);
        parent2.add(mother);

        Human granPa1 = new Human("granPa Pavel", true, 60, parent1);
        Human granMa1 = new Human("granPa Maria", false, 58, parent1);
        Human granPa2 = new Human("granPa Piotr", true, 65, parent2);
        Human granMa2 = new Human("granPa Fenya", false, 61, parent2);

        // выводим объекты на экран

        System.out.println(granPa1.toString());
        System.out.println(granMa1.toString());
        System.out.println(granPa2.toString());
        System.out.println(granMa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
