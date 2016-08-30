package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name = null;
    int age = 4;
    int ves = 3000;
    String color = "purple";
    String adres = null;

    public Cat(String name)
    {
        this.name = name;
    }

    public Cat(String name,int ves, int age)
    {
        this.name = name;
        this.ves = ves;
        this.age = age;
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Cat(int ves, String color)
    {
        this.color = name;
        this.ves = ves;
    }

    public Cat(int ves, String color, String adres)
    {
        this.color = name;
        this.ves = ves;
        this.adres = adres;
    }

}
