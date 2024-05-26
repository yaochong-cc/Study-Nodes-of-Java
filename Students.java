package com.hspedu.extend_;

//父类
public class Students {
    public String name;
    public int age;
    public double score;

   public void setScore(double score){
       this.score = score;
   }
   public void showInfo(){
       System.out.println("学生名："+name+" 年龄："+age+" 成绩："+score);
   }

}
