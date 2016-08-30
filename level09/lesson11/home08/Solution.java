package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> listOfArray = new ArrayList<int[]>();
        int[] m1 = {1,2,3,4,5};
        int[] m2 = {1,2};
        int[] m3 = {1,2,3,4};
        int[] m4 = {1,2,3,4,5,6,7};
        int[] m5 = {};
        listOfArray.add(m1);
        listOfArray.add(m2);
        listOfArray.add(m3);
        listOfArray.add(m4);
        listOfArray.add(m5);

        return listOfArray;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
