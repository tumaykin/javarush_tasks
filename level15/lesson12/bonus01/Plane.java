package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by kir on 06.02.2016.
 */
public class Plane implements Flyable
{
    int passanger;
    @Override
    public void fly()
    {

    }

    Plane(int passanger){
        this.passanger = passanger;
    }
}
