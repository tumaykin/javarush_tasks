package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String zp = reader.readLine();
        int r_zp = Integer.parseInt(zp);
        String let = reader.readLine();
        int r_let = Integer.parseInt(let);
        System.out.print(name + " получает " + r_zp + " через " + r_let + " лет.");


    }
}