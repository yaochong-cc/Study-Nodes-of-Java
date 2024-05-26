package com.hspedu.super_;

public class B extends A {
    private int n1=888;
    public void hi(){
        System.out.println(super.n1+super.n2+super.n3);

    }
    public void ok(){
        super.test100();
        super.test200();
        super.test300();
    }
//super(参数列表)：访问父类的构造器，只能放在构造器的第一句，只能出现一句。
    public B(){
//        super();
        super("java");
    }
    public void cal(){
        System.out.println("Bcal");
    }
    public void sum(){
        System.out.println("Bsum");
        //三者一样
        //调用顺序是：1先找本类，2再找父类，3继续找父类的父类
        //在父类中找到但不能访问，则报错
//        cal();
//        this.cal();
//        super.cal();//直接进入第二步，查找父类

        //访问属性
        //调用顺序是：1先找本类，2再找父类，3继续找父类的父类
        //在父类中找到但不能访问，则报错
        System.out.println(n1);
        System.out.println(this.n1);
        System.out.println(super.n1);
    }
    public void test(){
        System.out.println(super.n1);
        super.cal();
    }


}
