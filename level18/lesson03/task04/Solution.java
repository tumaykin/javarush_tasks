package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        int minvalue = Integer.MAX_VALUE;
        while (input.available() > 0)
        {
            int data = input.read();
            if (map.containsKey(data))
            {
                int value = map.get(data);
                map.put(data, value + 1);
            } else map.put(data, 1);
        }
        input.close();

        for (Map.Entry<Integer, Integer> element : map.entrySet())
        {
            if (element.getValue() < minvalue) minvalue=element.getValue();
        }
        for (Map.Entry<Integer, Integer> element : map.entrySet())
        {
            if (element.getValue() == minvalue) System.out.print(element.getKey() + " ");
        }
    }
}
