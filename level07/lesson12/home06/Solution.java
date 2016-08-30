package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human babaYul9 = new Human("Yulia", false, 43, null, null);
        Human babaNad9 = new Human("Nad9", false, 60, null, null);
        Human dedKost9 = new Human("Kost9", true, 47, null, null);
        Human dedSereja = new Human("Sergey", true, 65, null, null);
        Human papaKirill = new Human("Kirill", true, 23, dedKost9, babaYul9 );
        Human lubima9Olya = new Human("Olya", false, 29, dedSereja, babaNad9);
        Human dochaAlice = new Human("Alice", false, 0, papaKirill, lubima9Olya);
        Human sinSlava = new Human("Slava", true, 0 ,papaKirill, lubima9Olya);
        Human dochOlya = new Human("Olya", false, 0 , papaKirill, lubima9Olya);

        System.out.println(babaYul9);
        System.out.println(babaNad9);
        System.out.println(dedKost9);
        System.out.println(dedSereja);
        System.out.println(papaKirill);
        System.out.println(lubima9Olya);
        System.out.println(dochaAlice);
        System.out.println(sinSlava);
        System.out.println(dochOlya);
    }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
