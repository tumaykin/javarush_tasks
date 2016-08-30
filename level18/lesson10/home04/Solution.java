package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream FIS1 = new FileInputStream(filename1);
        FileInputStream FIS2 = new FileInputStream(filename2);


        byte[] buffer1 = new byte[FIS1.available()];
        FIS1.read(buffer1);
        byte[] buffer2 = new byte[FIS2.available()];
        FIS2.read(buffer2);

        FileOutputStream FOS1 = new FileOutputStream(filename1);
        FOS1.write(buffer2);
        FOS1.write(buffer1);

        reader.close();
        FIS1.close();
        FIS2.close();
        FOS1.close();



    }
}
