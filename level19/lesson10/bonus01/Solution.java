package com.javarush.test.level19.lesson10.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()));

        while(reader1.ready()){
            l1.add(reader1.readLine());
        }

        while(reader2.ready()){
            l2.add(reader2.readLine());
        }

        int x = 0;
        int y = 0;
        int max;
        if (l1.size() > l2.size()) max = l1.size();
        else max = l2.size();

        while(x < max && y < max){

            if((y == l2.size()) && (y != max)){
                lines.add(new LineItem(Type.REMOVED, l1.get(x)));
                x++;
                continue;
            }
            if((x == l1.size()) && (x != max)){
                lines.add(new LineItem(Type.ADDED, l2.get(y)));
                y++;
                continue;
            }


            if(l1.get(x).equals(l2.get(y))){
                lines.add(new LineItem(Type.SAME, l1.get(x)));
                x++;
                y++;
                continue;
            }


            if (l1.size() < l2.size())
            {
                if (l1.get(x).equals(l2.get(y + 1)))
                {
                    lines.add(new LineItem(Type.ADDED, l2.get(y)));
                    y++;
                    continue;
                }
                if (l1.get(x + 1).equals(l2.get(y)))
                {
                    lines.add(new LineItem(Type.REMOVED, l1.get(x)));
                    x++;
                    continue;
                }
            } else
            {
                if (l1.get(x + 1).equals(l2.get(y)))
                {
                    lines.add(new LineItem(Type.REMOVED, l1.get(x)));
                    x++;
                    continue;
                }
                if (l1.get(x).equals(l2.get(y + 1)))
                {
                    lines.add(new LineItem(Type.ADDED, l2.get(y)));
                    y++;
                    continue;
                }
            }
            break;
        }
        reader.close();
        reader1.close();
        reader2.close();
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }


}
