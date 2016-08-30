package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<String, Double> map = new HashMap<String, Double>();
        Double maxCash = Double.MIN_VALUE;


        String filename = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));

        while(fileReader.ready()){
            String s = fileReader.readLine();
            String[] array = s.split(" ");
            if(map.containsKey(array[0])) {
                Double current = map.get(array[0]);
                map.put(array[0], Double.valueOf(array[1]) + current);
            }
            else map.put(array[0], Double.valueOf(array[1]));


        }


        for (Map.Entry<String, Double> pair : map.entrySet()){
            if(maxCash < pair.getValue()) maxCash = pair.getValue();
        }

        for (Map.Entry<String, Double> pair : map.entrySet()){
            if(maxCash == pair.getValue()) System.out.println(pair.getKey());
        }

        fileReader.close();


    }
}
