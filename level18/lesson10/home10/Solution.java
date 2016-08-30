package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        HashMap<Integer, byte[]> map = new HashMap<Integer, byte[]>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        int fileOrder;
        int from =1;
        String outFilename = "1";
        boolean setOutFilename = false;

        while(!(filename = reader.readLine()).equals("end")){
            if (!setOutFilename){
                String[] buff = filename.split("\\.");
                outFilename = buff[0] + "." + buff[1];
                setOutFilename = true;
            }

            FileInputStream FIS = new FileInputStream(filename);
            byte[] buffer = new byte[FIS.available()];
            FIS.read(buffer);
            for(int i = filename.length(); i !=0; i--){
                String s = filename.substring(i-1);
                boolean isNumber = (s.matches("\\d.*"));
                if (!isNumber) break;
                from = i - 1;
            }
            int to = filename.length() ;
            fileOrder = Integer.valueOf(filename.substring(from, to));
            list.add(fileOrder);
            map.put(fileOrder, buffer);
            FIS.close();
        }

        reader.close();
        Collections.sort(list);

        FileOutputStream FOS = new FileOutputStream(outFilename);

        for(Integer s : list){
            FOS.write(map.get(s));
        }
        FOS.close();
    }
}
