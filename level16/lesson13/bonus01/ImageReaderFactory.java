package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by SBT-Tumaykin-kk on 11.02.2016.
 */
public class ImageReaderFactory
{
   public static ImageReader getReader(ImageTypes type){
       if (ImageTypes.BMP.equals(type)) return new BmpReader();
       else if (ImageTypes.JPG.equals(type)) return new JpgReader();
       else if (ImageTypes.PNG.equals(type)) return new PngReader();
       else throw  new IllegalArgumentException("Неизвестный тип картинки");

   }
}
