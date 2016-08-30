package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] bigList = new int[20];
        int[] firstList = new int[10];
        int[] secondList = new int[10];


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < bigList.length; i++)
        {
            bigList[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < firstList.length; i++)
        {
            firstList[i] = bigList[i];
        }

        int i = 0;
        int j = 10;
        while (true)
        {
            secondList[i] = bigList[j];
            System.out.println(secondList[i]);
            i++;
            j++;
            if (i == 10)
            {
                break;
            }

        }

    }
}
