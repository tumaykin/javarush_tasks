package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static int maxOf3(int a, int b, int c)
    {
        int m1;
        int m2;
        if (a > b)
            m1 = a;
        else
            m1 = b;

        if (m1 > c)
            m2 = m1;
        else
            m2 = c;
        return m2;
    }
    public static int minOf3(int a, int b, int c)
    {
        int m1;
        int m2;
        if (a < b)
            m1 = a;
        else
            m1 = b;

        if (m1 < c)
            m2 = m1;
        else
            m2 = c;
        return m2;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        String sB = reader.readLine();
        int b = Integer.parseInt(sB);

        String sC = reader.readLine();
        int c = Integer.parseInt(sC);

        int m1 = maxOf3(a, b, c);
        int m2 = 0;
        int m3 = minOf3(a, b, c);

        if (a != m1 && a != m3)
            m2 = a;
        else if (b != m1 && b != m3)
            m2 = b;
        else if (c != m1 && c != m3)
            m2 = c;

        System.out.print(m1 + " " + m2 + " " + m3);

    }
}
