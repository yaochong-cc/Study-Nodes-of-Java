package generic;

import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog>  arrayList=new ArrayList<Dog>();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",5));
        for(Dog dog:arrayList){
            System.out.println(dog.getName()+"-");
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
}