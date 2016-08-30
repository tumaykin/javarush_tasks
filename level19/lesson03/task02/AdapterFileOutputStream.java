package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream FOS;

    AdapterFileOutputStream(FileOutputStream FOS){
        this.FOS = FOS;
    }

    @Override
    public void flush() throws IOException
    {
        FOS.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        byte[] mass = s.getBytes();
        FOS.write(mass);
    }

    @Override
    public void close() throws IOException
    {
        FOS.close();
    }


}

