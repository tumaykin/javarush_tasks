package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

public class Solution {
    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner scanner;

        PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException, ParseException
        {
            String s = scanner.nextLine();
            String[] array = s.split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(array[5]),Integer.parseInt(array[4]) - 1, Integer.parseInt(array[3]));

            Person person = new Person(array[1], array[2], array[0], date.getTime());
            return person;
        }

        @Override
        public void close() throws IOException
        {
            scanner.close();
        }
    }
}
