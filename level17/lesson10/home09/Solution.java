package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static boolean iscontainAllLines = true;

    public static void main(String[] args) throws IOException
    {
        BufferedReader readPath = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFileAllLines = new BufferedReader(new FileReader(readPath.readLine()));
        BufferedReader readFileForRemoveLines = new BufferedReader(new FileReader(readPath.readLine()));


        String line;
        while ((line = readFileAllLines.readLine()) != null){
            allLines.add(line);
        }
        while ((line = readFileForRemoveLines.readLine()) != null){
            forRemoveLines.add(line);
        }

        Solution sol = new Solution();
        sol.joinData();
    }

    public void joinData () throws CorruptedDataException {
        for (String removeLine : forRemoveLines){
            if (!allLines.contains(removeLine)) iscontainAllLines = false;
        }

        if (iscontainAllLines){
            for (String removeLine : forRemoveLines){
                allLines.remove(removeLine);
            }
        }
        else {
            allLines.removeAll(allLines);
            throw new CorruptedDataException();

        }

    }
}
