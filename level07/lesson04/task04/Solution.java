package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }

        int[] reverseList = new int[10];

        int i = 0;
        int j = 9;

        while (true)
        {
            reverseList[j] = list[i];

            i++;
            j--;

            if(j == -1)
            {
                break;
            }
        }

        for (int y = 0; y < reverseList.length; y++)
        {
           System.out.println(reverseList[y]);
        }

    }
}
