package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String[] list;
        ArrayList<Float> listOfFloat = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

        FileInputStream FIS1 = new FileInputStream(filename1);
        byte[] buffer1 = new byte[FIS1.available()];
        FIS1.read(buffer1);

        String buf1 = new String(buffer1);
        list = buf1.split(" ");

        for (String number : list){
            listOfFloat.add(Float.valueOf(number));
        }

        FileOutputStream FOS2 = new FileOutputStream(filename2);

        for(Float number: listOfFloat){
            FOS2.write(String.valueOf(Math.round(number)).getBytes());
            FOS2.write(32);
        }

        reader.close();
        FIS1.close();
        FOS2.close();

    }
}
