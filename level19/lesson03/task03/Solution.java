package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры)
Обратите внимание на формат вывода фамилии и имени человека
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData incData;
        IncomeDataAdapter(IncomeData incData) {
            this.incData = incData;
        }

        @Override
        public String getCompanyName()
        {
            return incData.getCompany();
        }

        @Override
        public String getCountryName()
        {
            return countries.get(incData.getCountryCode());
        }

        @Override
        public String getName()
        {
            return incData.getContactLastName() + ", " + incData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber()
        {
            String number = String.valueOf(incData.getPhoneNumber());
            while (number.length() < 10){
                number = "0" + number;
            }
            char[] array = number.toCharArray();

            return "+" + incData.getCountryPhoneCode() + "(" + array[0] + array[1] + array[2] + ")" + array[3] + array[4] + array[5] + "-" + array[6] + array[7] + "-" + array[8] + array[9];
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}