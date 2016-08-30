package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] list = new String[3];

        list = s.split(" ");
        int a;
        for (int i = 0; i < list.length; i++)
        {
            if (!list[i].equals(""))

            {
                char ch = list[i].charAt(0);
                ch = Character.toUpperCase(ch);
                System.out.print(ch + list[i].substring(1) + " ");
                //System.out.println(list[i]);
            }

        }
    }


}
