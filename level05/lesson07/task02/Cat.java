package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public static void main(String[] args) {

    Cat vas9 = new Cat();
    vas9.initialize("vas9");

    }

    String name = null;
    int age = 4;
    int ves = 3000;
    String color = "purple";
    String adres = null;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name,int ves, int age)
    {
        this.name = name;
        this.ves = ves;
        this.age = age;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(int ves, String color)
    {
        this.color = name;
        this.ves = ves;
    }

    public void initialize(int ves, String color, String adres)
    {
        this.color = name;
        this.ves = ves;
        this.adres = adres;
    }


}
