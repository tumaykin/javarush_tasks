package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {



        String filename = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));

        while(fileReader.ready())
        {
            String line = fileReader.readLine();
            String name = "";
            ArrayList<Integer> birth = new ArrayList<>();
            Date birthDate;

            String[] array = line.split(" ");
            for (String s : array) {
                if (s.matches("\\d+")) birth.add(Integer.valueOf(s));
                else name = name + s + " ";
            }
            char[] nameArr = name.toCharArray();
            char[] nameArr2 = new char[nameArr.length -1];
            for(int i = 0; i < nameArr2.length; i++){
                nameArr2[i] =(char) nameArr[i];
            }
            name = String.valueOf(nameArr2);

            Calendar calendar = new GregorianCalendar(birth.get(2), birth.get(1) - 1, birth.get(0));
            birthDate = calendar.getTime();
            PEOPLE.add(new Person(name, birthDate));
        }

        fileReader.close();
    }

}
