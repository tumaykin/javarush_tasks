package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException
    {
        PrintStream console = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream newStream = new PrintStream(out);
        System.setOut(newStream);
        testString.printSomething();
        String current = out.toString();
        String[] array = current.split(" ");
        int a = Integer.valueOf(array[0]);
        int b = Integer.valueOf(array[2]);
        int c;
        System.setOut(console);

        if (array[1].equals("+")) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        }
        else if (array[1].equals("-"))  {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);
        }
        else if (array[1].equals("*"))  {
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);
        }
        out.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 - 6 = ");
        }
    }
}

