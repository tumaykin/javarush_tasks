package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true)
        {
            line = reader.readLine();
            try
            {
                if (line.equals("exit")) break;

                else if (line.contains("."))
                {
                    Double d1 = Double.parseDouble(line);
                    print(d1);
                }
                else if (Integer.parseInt(line) > 0 && Integer.parseInt(line) < 128 )
                {
                    short s = (short) Integer.parseInt(line);
                    print(s);
                }

                else if (Integer.parseInt(line) > 128)
                {
                    print(Integer.parseInt(line));
                }
            }
            catch (Exception e)
            {
                print(line);
            }






        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
