package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<String, Double> map = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
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


        for (Map.Entry pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        reader.close();
        fileReader.close();

    }
}
