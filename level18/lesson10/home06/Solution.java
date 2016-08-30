package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Character> list = new ArrayList();
        HashMap<Character, Integer> map = new HashMap<>();
        String filename = args[0];
        FileInputStream FIS = new FileInputStream(filename);

        while(FIS.available() > 0)
        {
            char c = (char) FIS.read();
            if (list.contains(c)){
                int value = map.get(c);
                map.put(c,value + 1);
            }
            else {
                list.add(c);
                map.put(c,1);
            }

        }

        Collections.sort(list);
        for (Character c : list){
            System.out.println(c + " " + map.get(c));
        }

        FIS.close();


    }
}
