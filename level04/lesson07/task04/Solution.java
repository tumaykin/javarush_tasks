package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        int a = Integer.parseInt(sA);

        String sB = reader.readLine();
        int b = Integer.parseInt(sB);

        String sC = reader.readLine();
        int c = Integer.parseInt(sC);

        int pCount = 0;
        int nCount = 0;

        if (a > 0)
            pCount++;
        else if (a < 0)
            nCount++;

        if (b > 0)
            pCount++;
        else if (b < 0)
            nCount++;

        if (c > 0)
            pCount++;
        else if (c < 0)
            nCount++;

        System.out.print("количество отрицательных чисел: " + nCount);
        System.out.print(" количество положительных чисел: " + pCount);

    }
}
