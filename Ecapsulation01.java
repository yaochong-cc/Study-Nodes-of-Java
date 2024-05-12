package com.hspedu.encap;

public class Ecapsulation01 {
    public static void main(String[] args) {
        Person person =new Person();
        person.setAge(31);
        person.setName("xiaom");
        person.setSalary(30000);
        System.out.println(person.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;


    //快捷键 Alt+insert


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<=6&&name.length()>=2){
            this.name = name;
        }else{
            this.name ="无名";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1&&age<=120){
            this.age = age;
        }else{
            System.out.println("使用默认年龄19");
            this.age=19;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info(){
        return "信息是 name="+name+" age="+age+" 薪水="+salary;
    }

}
