package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man bob = new Man("bob", 20, "Moscow");
        Man john = new Man("john", 230, "Moscow");
        Woman john1 = new Woman("john2", 230, "Moscow");
        Woman john2 = new Woman("john1", 230, "Moscow");

        System.out.println(bob);
        System.out.println(john.toString());

    }

    public static class Man
    {
        String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){ return name+" "+age+" "+address; }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

       public String toString(){ return name+" "+age+" "+address; }
    }



}
