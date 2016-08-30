package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {


        BufferedReader file1Reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2Writer = new BufferedWriter(new FileWriter(args[1]));
        String result = "";

        while(file1Reader.ready()){
            String line = file1Reader.readLine();
            String[] array = line.split(" ");

            for(String s : array){
                if(s.length() > 6) result = result + s + ",";
            }
        }

        file2Writer.write(result.substring(0,result.length()-1));
        file1Reader.close();
        file2Writer.close();

    }
}
