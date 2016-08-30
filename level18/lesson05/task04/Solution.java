package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        FileInputStream FIS = new FileInputStream(filename1);
        FileOutputStream FOS = new FileOutputStream(filename2);

        if (FIS.available() > 0){
            int aval = FIS.available();
            byte[] buffer = new byte[aval];
            FIS.read(buffer);

            for(int i = aval - 1; i != -1; i--){
                FOS.write(buffer[i]);
            }
        }
        reader.close();
        FIS.close();
        FOS.close();
    }
}
