package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, Date> wasBorn = createMap();
        removeAllSummerPeople(wasBorn);
        System.out.println(wasBorn);
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Сергеев", new Date("JULY 12 1956"));
        map.put("Иванов", new Date("SEPTEMBER 6 1967"));
        map.put("Стаханов", new Date("DECEMBER 23 1988"));
        map.put("Сталин", new Date("MAY 25 1969"));
        map.put("Куриев", new Date("APRIL 3 1978"));
        map.put("Сколов", new Date("NOVEMBER 19 1999"));
        map.put("Воробев", new Date("OCTOBER 4 1987"));
        map.put("Сергеева", new Date("JANUARY 7 1972"));
        map.put("Глодин", new Date("FEBRUARY 12 1978"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8)
            {
                iterator.remove();
            }
        }

    }
}

