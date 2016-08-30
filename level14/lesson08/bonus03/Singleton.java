package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by SBT-Tumaykin-KK on 02.02.2016.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}


    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
