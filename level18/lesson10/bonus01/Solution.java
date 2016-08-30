package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String key = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        FileInputStream FIS = new FileInputStream(fileName);
        byte[] buffer = new byte[FIS.available()];
        FIS.read(buffer);
        for (int i = 0; i < buffer.length; i++ ){
            if (key.equals("-e")) buffer[i] = ++buffer[i];
            else if (key.equals("-d")) buffer[i] = --buffer[i];
        }
        FileOutputStream FOS = new FileOutputStream(fileOutputName);
        FOS.write(buffer);
        FIS.close();
        FOS.close();
    }

}
