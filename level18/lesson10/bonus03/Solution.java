package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        if(args.length > 0){
            if(args[0].equals("-u")) update(args, filename);
           if(args[0].equals("-d")) delete(args,filename);
        }

    }

    public static void update(String[] args, String filename) throws IOException
    {
        if(args.length < 4) return;
        BufferedReader fr = new BufferedReader(new FileReader(filename));
        String finalString = "";
        String ln;
        while (fr.ready()){
            ln = fr.readLine();
            int currentID = Integer.parseInt(ln.substring(0, 8).trim());
            if (currentID == Integer.parseInt(args[1]) ) {
                String id = String.format("%-8.8s", currentID);
                String name = String.format("%-30.30s", getName(args));
                String price = String.format("%-8.8s", args[args.length-2]);
                String quantity = String.format("%-4.4s", args[args.length-1]);
                ln = id + name + price + quantity;
                finalString = finalString +ln + System.getProperty( "line.separator" );
            }
            else finalString = finalString + ln + System.getProperty( "line.separator" );
        }
        fr.close();
        BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
        fw.write(finalString);
        fw.close();
    }
    public static void delete(String args[], String filename) throws IOException
    {
        BufferedReader fr = new BufferedReader(new FileReader(filename));
        String finalString = "";
        String ln;
        while (fr.ready()){
            ln = fr.readLine();
            int currentID = Integer.parseInt(ln.substring(0, 8).trim());
            if (!(currentID == Integer.parseInt(args[1])) ) {
                finalString = finalString + ln + System.getProperty( "line.separator" );
            }
        }
        fr.close();
        BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
        fw.write(finalString);
        fw.close();
    }

    public static String getName(String[] args){
        StringBuilder line = new StringBuilder();
        for(int i = 2; i < args.length - 2; i++){
            line.append(args[i] + " ");
        }
        return line.toString();
    }
}
