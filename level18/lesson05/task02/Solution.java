package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;



public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream FIS = new FileInputStream(filename);
        int count = 0;
        while(FIS.available() > 0){
            if (FIS.read() == 44) count++;
        }
        System.out.println(count);
        reader.close();
        FIS.close();
    }
}
