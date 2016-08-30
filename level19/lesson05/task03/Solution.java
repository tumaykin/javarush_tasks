package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
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

        String line = "";

        while(file1.ready()){
            line = line + (char)file1.read();
        }

        String[] split = line.split(" ");

        for(String s : split){
            if (s.matches("\\d+")) file2.write(s + " ");
        }

        reader.close();
        file1.close();
        file2.close();
    }
}
