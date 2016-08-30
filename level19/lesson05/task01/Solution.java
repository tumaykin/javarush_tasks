package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
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
        int i = 1;

        while(file1.ready()){
            int symbol = file1.read();
            if((i % 2) == 0){
                file2.write(symbol);
            }
            i++;
        }

        file1.close();
        file2.flush();
        file2.close();


    }
}
