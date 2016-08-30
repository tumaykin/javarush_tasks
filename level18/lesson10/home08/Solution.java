package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename ="1";
        String curName;
        while (!(curName = reader.readLine()).equals("exit") ){
            filename = curName;
            new ReadThread(filename).start();
        }

        reader.close();

    }

    public static class ReadThread extends Thread {
        String filename;
        public ReadThread(String fileName) throws FileNotFoundException
        {
            //implement constructor body
            this.filename = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run()
        {
            FileInputStream FIS;
            HashMap<Integer, Integer> currMap = new HashMap<>();
            int maxValue = Integer.MIN_VALUE;
            int maxKey = 0;
            try
            {
                FIS = new FileInputStream(filename);
                while(FIS.available() > 0){
                    int abyte = FIS.read();
                    if (currMap.containsKey(abyte)){
                        int value = currMap.get(abyte);
                        currMap.put(abyte, ++value);
                    }
                    else currMap.put(abyte, 1);
                }
                for (Map.Entry<Integer, Integer> pair : currMap.entrySet()){
                    if (pair.getValue() > maxValue) {
                        maxValue = pair.getValue();
                        maxKey = pair.getKey();
                    }
                }
                resultMap.put(filename, maxKey);
                FIS.close();


            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        }
    }
}
