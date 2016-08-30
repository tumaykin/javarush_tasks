package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileReader file1 = new FileReader(filename1);
        FileWriter file2 = new FileWriter(filename2);
        int aByte;

        while(file1.ready()){
            aByte = file1.read();
            if (aByte == 46) file2.write(33);
            else file2.write(aByte);
        }

        reader.close();
        file1.close();
        file2.close();


    }
}
