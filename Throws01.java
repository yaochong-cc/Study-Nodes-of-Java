package com.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
   //throws 后面的异常类可以是方法中的产生的异常类型，也可以是它的父类
//   throws 关键字后面可以是异常列表，即可以是多个异常,用“,"隔开；

    public void f1() throws FileNotFoundException,NullPointerException {
        //创建一个文件流对象；
        //异常：FileNotFoundException 编译异常

        FileInputStream fis=new FileInputStream("D://aa.txt");
    }
}
