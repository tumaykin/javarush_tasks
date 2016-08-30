package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader file1Reader = new BufferedReader(new FileReader(args[0]));
        FileOutputStream FOS = new FileOutputStream(args[1]);

        while(file1Reader.ready()){
            String line = file1Reader.readLine();
            String[] array = line.split(" ");
            for(String s : array){
                if(s.matches(".*\\d+.*")) {
                    FOS.write(s.getBytes());
                    FOS.write(32);
                }
            }
        }

        file1Reader.close();
        FOS.close();

    }
}
