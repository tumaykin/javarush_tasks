package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String id = args[0];
        ArrayList<String[]> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String s;

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename1)));
        while ((s = fileReader.readLine()) != null){
            String[] array = s.split(" ");
            list.add(array);
        }

        for(int i = 0; i < list.size(); i++ ){
            String[] arr = list.get(i);
            String s1 = arr[0];
            if (id.equals(s1)) {
                for (String s2 : arr){
                    System.out.print(s2 + " ");
                }
                System.out.println();
            }
        }
        reader.close();
        fileReader.close();
    }
}
