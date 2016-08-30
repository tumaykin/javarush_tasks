package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

import java.util.Random;

public class Solution
{
    public static void main(String[] args)
    {

        Zerg a = new Zerg();
        a.name = "1";

        Zerg b = new Zerg();
        b.name = "2";

        Zerg c = new Zerg();
        c.name = "3";

        Zerg d = new Zerg();
        d.name = "4";

        Zerg e = new Zerg();
        e.name = "5";

        Zerg f = new Zerg();
        f.name = "6";

        Zerg g = new Zerg();
        g.name = "7";

        Zerg q = new Zerg();
        q.name = "8";

        Zerg w = new Zerg();
        w.name = "9";

        Zerg r = new Zerg();
        r.name = "10";



        Protos q1 = new Protos();
        q1.name = "q1";

        Protos q2 = new Protos();
        q2.name = "q2";

        Protos q3 = new Protos();
        q3.name = "q3";

        Protos q4 = new Protos();
        q4.name = "q4";

        Protos q5 = new Protos();
        q5.name = "q5";




        Terran w1 = new Terran();
        w1.name = "w1";

        Terran w2 = new Terran();
        w2.name = "w2";

        Terran w3 = new Terran();
        w3.name = "w3";

        Terran w4 = new Terran();
        w4.name = "w4";

        Terran w5 = new Terran();
        w5.name = "w5";

        Terran w6 = new Terran();
        w6.name = "w6";

        Terran w7 = new Terran();
        w7.name = "w7";

        Terran w8 = new Terran();
        w8.name = "w8";

        Terran w9 = new Terran();
        w9.name = "w9";

        Terran w10 = new Terran();
        w10.name = "w10";

        Terran w11 = new Terran();
        w11.name = "w11";

        Terran w12 = new Terran();
        w12.name = "w12";
    }




    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}