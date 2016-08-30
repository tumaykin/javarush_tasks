package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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

        FileInputStream FI1 = new FileInputStream(filename1);
        FileOutputStream FO1 = new FileOutputStream(filename2);
        FileOutputStream FO2 = new FileOutputStream(filename3);
        int available = 0;
        int a1;
        int a2;

        if (FI1.available() > 0) available =  FI1.available();
        if ((available % 2) != 0) {
            available = available + 1;
            a1 = (available/2);
            a2 = (available/2) - 1;
        }
        else{
            a1 = (available/2);
            a2 = (available/2);
        }

        byte[] buffer1 = new byte[a1];
        byte[] buffer2 = new byte[a2];
        FI1.read(buffer1, 0, a1);
        FI1.read(buffer2, 0, a2);

        FO1.write(buffer1);
        FO2.write(buffer2);

        reader.close();
        FI1.close();
        FO1.close();
        FO2.close();

    }
}
