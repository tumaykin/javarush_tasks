package com.javarush.test.level17.lesson10.bonus01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        //start here - начни тут
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if(args[0].equals("-c")){
            Date date = format.parse(args[3]);
            if(args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], date));
                System.out.println(allPeople.size()-1);
            }
            else if(args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1], date));
                System.out.println(allPeople.size()-1);
            }
        }
        else if(args[0].equals("-u")){
            Person current = allPeople.get(Integer.parseInt(args[1]));
            current.setName(args[2]);
            if(args[3] == "м") current.setSex(Sex.MALE);
            else if(args[3] == "ж") current.setSex(Sex.FEMALE);
            Date date = format.parse(args[4]);
            current.setBirthDay(date);
        }
        else if(args[0].equals("-d")){
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        }
        else if(args[0].equals("-i")){
            Person current = allPeople.get(Integer.parseInt(args[1]));
            String sex = "";
            if (current.getSex().equals(Sex.FEMALE)) sex = " ж ";
            else if(current.getSex().equals(Sex.MALE)) sex = " м ";
            SimpleDateFormat outputformat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(current.getName() + sex + outputformat.format(current.getBirthDay()) );
        }


    }
}
