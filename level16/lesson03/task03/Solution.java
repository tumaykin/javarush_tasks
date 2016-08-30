package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread n1 = new SpecialThread();
        SpecialThread n2 = new SpecialThread();
        SpecialThread n3 = new SpecialThread();
        SpecialThread n4 = new SpecialThread();
        SpecialThread n5 = new SpecialThread();

        Thread t1 = new Thread(n1);
        list.add(t1);

        Thread t2 = new Thread(n2);
        list.add(t2);
        Thread t3 = new Thread(n3);
        list.add(t3);

        Thread t4 = new Thread(n4);
        list.add(t4);
        Thread t5 = new Thread(n5);
        list.add(t5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
