package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

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
        Map<String, Cat> mapcat = new HashMap<String, Cat>();
        mapcat.put("CatName1", new Cat("CatName1"));
        mapcat.put("CatName2", new Cat("CatName2"));
        mapcat.put("CatName3", new Cat("CatName3"));
        mapcat.put("CatName4", new Cat("CatName4"));
        mapcat.put("CatName5", new Cat("CatName5"));
        mapcat.put("CatName6", new Cat("CatName6"));
        mapcat.put("CatName7", new Cat("CatName7"));
        mapcat.put("CatName8", new Cat("CatName8"));
        mapcat.put("CatName9", new Cat("CatName9"));
        mapcat.put("CatName10", new Cat("CatName10"));

        return mapcat;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //HashSet<Cat> set = new HashSet<Cat>();
        //for (Map.Entry<String, Cat> pair : map.entrySet())
        //{
        //    set.add(pair.getValue());
        //}
        Set<Cat> set = new HashSet<Cat>(map.values());

        return set;

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
