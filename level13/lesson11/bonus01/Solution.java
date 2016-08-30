package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

//import javafx.collections.transformation.SortedList;

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fIS = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer number = null;

        while (fIS.available() > 0){

            String str = "";
            Character ch = (char)(fIS.read());
            str = str + Character.toString(ch);
            while (!ch.equals('\n') && !ch.equals('\uFFFF') && !ch.equals(' ')  )
            {
                ch = (char)(fIS.read());

                if (!ch.equals('\n') && !ch.equals('\uFFFF') && !ch.equals(' ') )
                {
                    str = str + Character.toString(ch);
                }

            }

            if (!str.equals("\n"))
            {
                number = Integer.parseInt(str);
                if (number % 2 == 0){list.add(number);}
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i) > list.get(j)){
                    int buffer = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buffer);

                }
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        fIS.close();
    }
}
