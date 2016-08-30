package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static int maxOf2(int a, int b)
    {
        int m1;
        if (a > b)
            m1 = a;
        else
            m1 = b;
        return m1;
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

        String sD = reader.readLine();
        int d = Integer.parseInt(sD);

        int rez;
        rez = maxOf2((maxOf2(a,b)),(maxOf2(c,d)));
        System.out.println(rez);
    }
}
