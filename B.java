package com.hspedu.modifier;

import java.sql.SQLOutput;

public class B {
    public void say(){
        A a=new A();
        //同包不同类，不能访问private
        System.out.println("n1="+a.n1+" n2="+a.n2+" n3="+a.n3);
    }
}
