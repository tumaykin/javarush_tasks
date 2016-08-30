package com.javarush.test.level08.lesson08.task01;

import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> set2 = createSet();

        for (String name : set2)
        {
            System.out.println(name);
        }
    }
    public static HashSet<String> createSet()
    {
        HashSet<String> set1 = new HashSet<>();

        for (int i = 1; i <= 20; i++)
        {
            set1.add("Лил" + i);
        }
        return set1;

    }
}
