package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/


import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        FileInputStream FIS = new FileInputStream(filename);
        int countOfSymbol = FIS.available();
        int countOfSpace = 0;
        byte[] buffer = new byte[FIS.available()];

        FIS.read(buffer);
        for (int i = 0; i < buffer.length; i++){
            if(buffer[i] == 32) countOfSpace++;
        }
        float result = ((float) countOfSpace/countOfSymbol) * 100;
        System.out.printf("%8.2f", result);
        FIS.close();
    }
}
