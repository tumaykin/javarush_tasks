package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        FileInputStream FIS = new FileInputStream(filename);
        byte[] mass = new byte[FIS.available()];
        FIS.read(mass);
        int count = 0;

        for (int i = 0; i < mass.length; i++){
            if ((mass[i] >= 65 && mass[i] <=90) || (mass[i] >= 97 && mass[i] <=122)) count++;
        }
        System.out.println(count);
        FIS.close();
    }
}
