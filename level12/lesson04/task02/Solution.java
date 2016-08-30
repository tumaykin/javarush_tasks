package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer a = 5;
        int b = 5;
        print(a);
        print(b);

    }

    static void print(int a){}
    static void print(Integer a){}
}
