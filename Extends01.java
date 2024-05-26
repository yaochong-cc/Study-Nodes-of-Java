package com.hspedu.extend_;

public class Extends01 {
    public static void main(String[] args) {
       com.hspedu.extend_.Pupil p=new Pupil();
        p.name="John";
        p.age=18;
        p.testing();
        p.setScore(80);
        p.showInfo();

        com.hspedu.extend_.Graduate g=new Graduate();
        g.name="Jhhony";
        g.age=20;
        g.testing();
        g.setScore(90);
        g.showInfo();
    }
}
