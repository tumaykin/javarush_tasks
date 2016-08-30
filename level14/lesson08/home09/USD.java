package com.javarush.test.level14.lesson08.home09;

/**
 * Created by SBT-Tumaykin-KK on 02.02.2016.
 */
public class USD extends Money
{
    public USD(double amount){
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
