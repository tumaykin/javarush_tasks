package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        HashMap<String,String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Kirill"));
        System.out.println(getCountTheSameLastName(map, "Tumaykin1"));

    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String,String>();
        for (int i = 1; i <= 10; i++)
        {
            map.put("Tumaykin" + i, "Kirill");


        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pare : map.entrySet())
        {
            if (pare.getValue().equals(name)) count++;

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pare : map.entrySet())
        {

            if (pare.getKey().equals(lastName)) count++;

        }
        return count;

    }
}
