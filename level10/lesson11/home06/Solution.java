package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String firstName;
        String lastName;
        int sex;
        int family;
        int children;
        int job;

        Human(String firstName)
        {
            this.firstName = firstName;
        }

        Human(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        Human(String firstName, int sex)
        {
            this.firstName = firstName;
            this.sex = sex;
        }

        Human(String firstName, int sex, int job)
        {
            this.firstName = firstName;
            this.sex = sex;
            this.sex = job;
        }

        Human(String firstName, int sex, int family, int job)
        {
            this.firstName = firstName;
            this.sex = sex;
            this.job = job;
        }

        Human(String firstName, String lastName, int sex)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        Human(String firstName, String lastName, int sex, int job)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.job = job;
        }

        Human(String firstName, String lastName, int sex, int job,int children)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.job = job;
            this.children = children;
        }

        Human(String firstName, String lastName, int sex, int job, int children, int family)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.job = job;
            this.children = children;
            this.family = family;
        }

        Human(String lastName, int sex, int job, int children, int family)
        {

            this.lastName = lastName;
            this.sex = sex;
            this.job = job;
            this.children = children;
            this.family = family;
        }
    }
}
