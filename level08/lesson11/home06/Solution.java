package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human alice = new Human("Alice", false, 0);
        Human slava = new Human("Lev", true, 0);
        Human ol9 = new Human("ol9", false, 0);
        Human kirill = new Human("kirill", true, 23);
        kirill.children.add(alice);
        kirill.children.add(slava);
        kirill.children.add(ol9);
        Human mOl9 = new Human("Ol9", false, 29);
        mOl9.children.add(alice);
        mOl9.children.add(slava);
        mOl9.children.add(ol9);



        Human Kost9 = new Human("Kost9", true, 50);
        Kost9.children.add(kirill);
        Human Juliya = new Human("Juliya", false, 43);
        Juliya.children.add(kirill);

        Human nad9 = new Human("nad9", false, 50);
        nad9.children.add(mOl9);
        Human vitalii = new Human("vitalii", false, 63);
        vitalii.children.add(mOl9);

        System.out.println(nad9);
        System.out.println(vitalii);
        System.out.println(Kost9);
        System.out.println(Juliya);
        System.out.println(kirill);
        System.out.println(mOl9);
        System.out.println(alice);
        System.out.println(slava);
        System.out.println(ol9);


    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
