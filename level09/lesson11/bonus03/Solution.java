package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        //String[] array = list.toArray(new String[list.size()]);
        list = sort(list);

        for (String x : list)
        {
            System.out.println(x);
        }
    }

    public static ArrayList<String> sort(ArrayList<String> array)
    {
        ArrayList<Integer> stringIndexArray = new ArrayList<Integer>();
        ArrayList<Integer> numberIndexArray = new ArrayList<Integer>();
        ArrayList<String> arrayOfString = new ArrayList<String>();
        ArrayList<String> arrayOfNumber = new ArrayList<String>();
        ArrayList<String> resultArray = new ArrayList<String>();
        String element;

        //создаем массивы чисел и строк и массивы индексов на них
        for (int i = 0; i < array.size(); i++ )
        {
            element = array.get(i);
            if (isNumber(element))
            {
                numberIndexArray.add(i);
                arrayOfNumber.add(element);
            }
            else
            {
                stringIndexArray.add(i);
                arrayOfString.add(element);
            }
        }
        //сортируем массив чисел по убыванию
        for (int i = 0; i < arrayOfNumber.size(); i++)
        {
            for (int j = i + 1; j < arrayOfNumber.size(); j++)

            if (isLowerThan(arrayOfNumber.get(i), arrayOfNumber.get(j)))
            {
                String bufferForI = arrayOfNumber.get(i);
                arrayOfNumber.set(i, arrayOfNumber.get(j));
                arrayOfNumber.set(j, bufferForI);
            }
        }

        //сортируем массив строк по возрастанию
        Collections.sort(arrayOfString);
        //собираем результирующий массив
        for (int i = 0; i < array.size(); i++) //инициализируем список, для возможности в дальнейщем делать ArrayList.set
        {
            resultArray.add(null);
        }
        for (int i = 0; i < arrayOfString.size(); i++)
            {
                resultArray.set(stringIndexArray.get(i), arrayOfString.get(i));
            }
        for (int i = 0; i < arrayOfNumber.size(); i++)
            {
                resultArray.set(numberIndexArray.get(i), arrayOfNumber.get(i));
            }
        return resultArray;
    }



    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isLowerThan(String a, String b)
    {
        return Integer.parseInt(a) < Integer.parseInt(b);
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
