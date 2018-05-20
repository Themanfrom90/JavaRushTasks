package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name = "Zerg1";
        zerg2.name = "Zerg2";
        zerg3.name = "Zerg3";
        zerg4.name = "Zerg4";
        zerg5.name = "Zerg5";
        zerg6.name = "Zerg6";
        zerg7.name = "Zerg7";
        zerg8.name = "Zerg8";
        zerg9.name = "Zerg9";
        zerg10.name = "Zerg10";

        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();
        Protoss p4 = new Protoss();
        Protoss p5 = new Protoss();

        p1.name = "p1";
        p2.name = "p2";
        p3.name = "p3";
        p4.name = "p4";
        p5.name = "p5";

        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();
        Terran t5 = new Terran();
        Terran t6 = new Terran();
        Terran t7 = new Terran();
        Terran t8 = new Terran();
        Terran t9 = new Terran();
        Terran t10 = new Terran();
        Terran t11 = new Terran();
        Terran t12 = new Terran();

        t1.name = "t1";
        t2.name = "t2";
        t3.name = "t3";
        t4.name = "t4";
        t5.name = "t5";
        t6.name = "t6";
        t7.name = "t7";
        t8.name = "t8";
        t9.name = "t9";
        t10.name = "t10";
        t11.name = "t11";
        t12.name = "t12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
