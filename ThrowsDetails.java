package com.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetails {
    public static void main(String[] args) {
        f2();
    }
    public static void f2(){
        int n1=10;
        int n2=0;
        double res =n1/n2;
    }
    public static void f1() throws FileNotFoundException{
        //f3()抛出编译异常，则f1()必须处理这个异常(throws或try-catch)       f3();
    }

    public static void f3() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("D://aa.txt");
    }
    public static void f4(){
        f5();//ArithmeticException是运行异常，不用处理
    }
    public static void f5() throws ArithmeticException{

    }
}
class Father{
    public void method() throws RuntimeException{

    }
}
///子类抛出的异常要么与父类相同，要么是父类抛出异常的子类
//有try-catch 就不用再throws
class Son extends Father{
    @Override
    public void method() throws NullPointerException{

    }
}