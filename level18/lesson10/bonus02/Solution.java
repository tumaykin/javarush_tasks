package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

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

    static String lastLines = "";
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        if(args.length > 0)
        {
            if (args[0].equals("-c")) add(args, filename);
        }
        reader.close();
    }


    public static void add(String[] args, String filename) throws IOException
    {
        if(args.length < 4) return;
        BufferedWriter fw = new BufferedWriter(new FileWriter(filename, true));
        String id = String.format("%-8.8s", getID(filename));
        String name = String.format("%-30.30s", getName(args));
        String price = String.format("%-8.8s", args[args.length - 2]);
        String quantity = String.format("%-4.4s", args[args.length -1]);
        if(!(lastLines.equals("") || lastLines.equals(" ") || lastLines.equals("  "))) fw.write(System.getProperty( "line.separator" ));
        fw.write(id+name+price+quantity);
        fw.flush();
        fw.close();
    }

    public static int getID(String filename) throws IOException
    {
        BufferedReader fr = new BufferedReader((new FileReader(filename)));
        int id = Integer.MIN_VALUE;
        while (fr.ready())
        {
            String ln = fr.readLine();
            if(!(ln.equals("") || ln.equals(" ") || ln.equals("  ")))
            {
                int currentID = Integer.parseInt(ln.substring(0, 8).trim());
                if (currentID > id) id = currentID;
            }
            lastLines = ln;
        }
        id++;
        fr.close();
        return id;
    }
    public static String getName(String[] args){
        StringBuilder line = new StringBuilder();
        for(int i = 1; i < args.length - 2; i++){
            line.append(args[i] + " ");
        }
        return line.toString();


    }
}
