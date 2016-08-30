package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();

        FileOutputStream FOS1 = new FileOutputStream(filename1);
        FileInputStream FIS2 = new FileInputStream(filename2);
        FileInputStream FIS3 = new FileInputStream(filename3);


        byte[] buffer2 = new byte[FIS2.available()];
        FIS2.read(buffer2);
        FOS1.write(buffer2);
        byte[] buffer3 = new byte[FIS3.available()];
        FIS3.read(buffer3);
        FOS1.write(buffer3);

        reader.close();
        FOS1.close();
        FIS2.close();
        FIS3.close();


    }
}
