package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] parametersAsLine;
        String[] arrayOfParameters;
        ArrayList<String> obj = new ArrayList<String>();

        parametersAsLine = url.split("\\?");
        arrayOfParameters = parametersAsLine[1].split("\\&");

        for (int i = 0; i < arrayOfParameters.length; i++)
        {
            String[] parameter = arrayOfParameters[i].split("=");
            if (parameter[0].equals("obj"))
            {
                obj.add(parameter[1]);
            }
            System.out.print(parameter[0] + " ");
        }
        System.out.println();

        for (String param : obj)
        {
            try
            {
                alert(Double.parseDouble(param));
            }
            catch(Exception e)
            {
                alert(param);
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
