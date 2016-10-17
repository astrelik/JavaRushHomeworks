package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Set<String> flore = new HashSet<String>();
        flore.add("арбуз");
        flore.add("банан");
        flore.add("вишня");
        flore.add("груша");
        flore.add("дыня");
        flore.add("ежевика");
        flore.add("жень-шень");
        flore.add("земляника");
        flore.add("ирис");
        flore.add("картофель");

        for (String x : flore){
            System.out.println(x);
        }
    }
}