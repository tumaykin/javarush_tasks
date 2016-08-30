package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
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


    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        String sB = reader.readLine();
        int b = Integer.parseInt(sB);

        String sC = reader.readLine();
        int c = Integer.parseInt(sC);

        int x;
        x = maxOf3(a, b, c);

        if (x == a)
        {
            if (b + c > x)
                System.out.println("Треугольник существует.");
            else
                System.out.println("Треугольник не существует.");
        }

        else if (x == b)
        {
            if (a + c > x)
                System.out.println("Треугольник существует.");
            else
                System.out.println("Треугольник не существует.");
        }

        else if (x == c)
        {
            if (a + b > x)
                System.out.println("Треугольник существует.");
            else
                System.out.println("Треугольник не существует.");
        }

    }
}