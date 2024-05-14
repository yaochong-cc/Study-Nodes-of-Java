package com.hspedu.extend_;

public class Sub extends Base {
   public Sub(String name,int age){
       super("xiaoming",33);
       System.out.println("string+age");
   }
    public Sub(){
        super("java",12);//默认调用父类无参构造器
        System.out.println("sub");
    }
    public Sub(String name){
        super("helllo",23);
        System.out.println("sub string");
    }
    public void sayOk(){
        System.out.println(n1+" "+n2+" "+n3+" ");//不能访问n4
        System.out.println();
        test100();
        test200();
        test300();
//        test400();//不能访问test400
        System.out.println(getN4());
        callTest400();
    }
}
