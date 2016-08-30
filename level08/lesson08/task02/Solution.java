package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        HashSet<Integer> set1 = createSet();
        HashSet<Integer> set2 = removeAllNumbersMoreThan10(set1);

        for (int name : set2)
        {
            System.out.println(name);
        }
    }

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++)
        {
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> resultSet = new HashSet<>();
        for (int number : set)
        {
            if (number <= 10) resultSet.add(number);
        }
        return resultSet;

    }
}
