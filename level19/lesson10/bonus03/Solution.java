package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
*/



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader freader = new BufferedReader(new FileReader(reader.readLine()));
        String s = "";
        while (freader.ready()) {
            s = s + freader.readLine();
        }

        s = s.replaceAll("\\n", "");
        s = s.replaceAll("\\r", "");
        String tag = "span";

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> st = new ArrayList<>();
        ArrayList<Integer> en = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        CharSequence inputStr = s;
        String pattern1 = "<" +tag+ ">|<" +tag+ "\\s+.*?>";
        Pattern patternStart = Pattern.compile(pattern1);
        Matcher matcherStart = patternStart.matcher(inputStr);
        while (matcherStart.find()) {
            st.add(matcherStart.start());
            output.add(matcherStart.start());
        }
        String pattern2 = "</" +tag+ ">";
        Pattern patternEnd = Pattern.compile(pattern2);
        Matcher matcherEnd = patternEnd.matcher(inputStr);
        while (matcherEnd.find()) {
            en.add(matcherEnd.end());
        }

        while(st.size() > 0){
            int j = 0;
            int x = st.get(st.size() - 1);
            while(en.get(j) < x) j++;
            int y = en.get(j);
            map.put(x,y);
            st.remove(st.indexOf(x));
            en.remove(en.indexOf(y));
        }

        for(int i = 0; i < output.size(); i++){
            System.out.println(s.substring(output.get(i), map.get(output.get(i))));
        }

        reader.close();
        freader.close();
    }

}
