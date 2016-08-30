package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileReader file = new FileReader(filename);
        int count = 0;
        String line = "";
        int aByte;


        while(file.ready())
        {
            aByte = file.read();
            if (aByte != 10 && aByte != 13) line = line + (char) aByte;
            else line += ".";
        }

        String[] split = line.split("[., !?;:-]");

        for(String s : split){
            if(s.equals("world")) count++;
        }




        System.out.println(count);
        reader.close();
        file.close();
    }
}

