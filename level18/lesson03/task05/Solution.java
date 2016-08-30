package com.javarush.test.level18.lesson03.task05;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        while (input.available() > 0)
        {
            int data = input.read();
            map.put(data, 1);
        }
        input.close();

        for (Map.Entry<Integer, Integer> element : map.entrySet())
        {
            list.add(element.getKey());
        }

        for (int i = 0; i < list.size();i++)
            for(int j = i + 1; j < list.size();j++){
                if (list.get(i) > list.get(j)){
                    int buffer = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buffer);
                }
            }


        for (int i : list){
            System.out.println(i);
        }
    }
}