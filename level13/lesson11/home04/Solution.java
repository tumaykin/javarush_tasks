package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        OutputStream outToFile = new FileOutputStream(filename);
        String word;
        while (true){
            word = reader.readLine() + "\n";
            byte[] wordMassive = word.getBytes();
            outToFile.write(wordMassive);

            if (word.equals("exit\n")){
                break;
            }


        }
        reader.close();
        outToFile.close();

    }
}

