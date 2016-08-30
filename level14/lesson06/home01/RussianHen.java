package com.javarush.test.level14.lesson06.home01;

/**
 * Created by SBT-Tumaykin-KK on 02.02.2016.
 */
public class RussianHen extends Hen implements Country
{

    int getCountOfEggsPerMonth()
    {
        return 15;
    }


    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
