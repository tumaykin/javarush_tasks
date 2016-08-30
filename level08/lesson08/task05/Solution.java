package com.javarush.test.level08.lesson08.task05;

import java.lang.ref.SoftReference;
import java.util.*;

//Программа-КОСТЫЛИ, позже оптимизировать
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> newMap = new HashMap<String, String>();

        newMap.put("Tumaikin1", "Kir1");
        newMap.put("Tumaikin2", "Kir1");
        newMap.put("Tumaikin3", "Kir1");
        newMap.put("Tumaikin4", "Kir3");
        newMap.put("Tumaikin5", "Kir4");
        newMap.put("Tumaikin6", "Kir5");
        newMap.put("Tumaikin7", "Kir5");
        newMap.put("Tumaikin8", "Kir3");
        newMap.put("Tumaikin9", "Kir6");
        newMap.put("Tumaikin10", "Kir7");



        return newMap;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map1 = new HashMap<String, String>(map);
        HashMap<String, String> map2 = new HashMap<String, String>(map);








        Iterator<Map.Entry<String,String>> iterator = map1.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String,String> pair = iterator.next();
            String lastName = pair.getValue();
            String firstName = pair.getKey();
            map2.remove(firstName);
            if (map2.containsValue(lastName))
            {
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
                map.values().remove(lastName);
            }


        }


        System.out.println(map);

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        System.out.println(map);
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
        removeItemFromMapByValue(map, "Kir6");
    }
}
