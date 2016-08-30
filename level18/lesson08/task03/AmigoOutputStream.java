package com.javarush.test.level18.lesson08.task03;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream original;
    AmigoOutputStream(FileOutputStream f) throws FileNotFoundException {
        super(fileName);
        this.original = f;
    }

    @Override
    public void close() throws IOException
    {
        original.flush();
        original.write("JavaRush © 2012-2013 All rights reserved.".getBytes());
        original.close();

    }

    @Override
    public void write(int i) throws IOException
    {
        original.write(i);
    }

    @Override
    public void write(byte[] bytes) throws IOException
    {
        original.write(bytes);
    }

    @Override
    public void write(byte[] bytes, int i, int i1) throws IOException
    {
        original.write(bytes, i, i1);
    }

    @Override
    public void flush() throws IOException
    {
        original.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

