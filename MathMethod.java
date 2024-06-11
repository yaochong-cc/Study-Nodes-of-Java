package com.math_;

public class MathMethod {
    public static void main(String[] args) {
        int abs=Math.abs(-34);
        System.out.println(abs);

        double pow=Math.pow(2,4);
        System.out.println(pow);

        double ceil =Math.ceil(-2.001);//向上取整
        System.out.println(ceil);

        double floor=Math.floor(-2.001);//向下取整
        System.out.println(floor);

        long round =Math.round(-5.001);//四舍五入
        System.out.println(round);

        double sqrt =Math.sqrt(-9.0);
        System.out.println(sqrt);//NaN(Not a Number)

        //random 随机数 [0,1)
        for(int i=0;i<10;i++){
            System.out.print(Math.random()+" ");
        }
        //[a,b) :(int) a<= x < (int)( a+Math.random()*(b-a) )
        //[a,b]=[a,b+1)
        //eg.[2,7]
        for(int i=0;i<10;i++){
            System.out.println((int)(2+Math.random()*6));
        }


        int min=Math.min(1,9);
        int max=Math.max(1,9);
        System.out.println(min+" "+max);

    }
}
