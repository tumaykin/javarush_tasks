package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i <= 100; i = i + 2)
        {
            if (i != 0)
            System.out.println(i);
        }


    }
}
