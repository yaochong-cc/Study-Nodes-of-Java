package com.string;

public class StringExercise04 {
    String str ="cc";
    final char []ch={'j','v','a','v'};
    public void changes(String str,char[]ch){
        str="java";
        ch[0]='h';
    }

    public static void main(String[] args) {
        StringExercise04 ex=new StringExercise04();
        ex.changes(ex.str,ex.ch);
        System.out.println(ex.str+" and");
        System.out.println(ex.ch);
    }
}
