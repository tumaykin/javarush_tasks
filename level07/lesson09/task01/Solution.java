package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> dev3List = new ArrayList<Integer>();
        ArrayList<Integer> dev2List = new ArrayList<Integer>();
        ArrayList<Integer> otherList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++)
        {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 20; i++)
        {
            if (mainList.get(i) % 3 == 0) dev3List.add(mainList.get(i));
            if (mainList.get(i) % 2 == 0) dev2List.add( mainList.get(i));
            if (mainList.get(i) % 2 != 0 && mainList.get(i) % 3 != 0) otherList.add(mainList.get(i));
        }

        printList(dev3List);
        printList(dev2List);
        printList(otherList);


    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
