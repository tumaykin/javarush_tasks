package com.javarush.test.level17.lesson04.task02;

import java.util.ArrayList;
import java.util.List;

/* Синхронизированные заметки 2
Класс Note будет использоваться нитями. Поэтому сделай так, чтобы вcе методы были синхронизированы
*/

public class Solution {
    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }


    }

    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Note n = new Note();
                n.addNote(0, "fcf");
                //n.removeNote(0);
                System.out.println(n.notes.get(0));


            }
        });
        t1.start();
    }
}
