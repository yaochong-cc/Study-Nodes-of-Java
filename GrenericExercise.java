package generic;

import java.util.HashMap;
import java.util.HashSet;

public class GrenericExercise {
    public static void main(String[] args) {
//        使用泛型给HashSet 放入三个学生对象
        HashSet<Student> students=new HashSet<Student>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",15));
        students.add(new Student("tomas",12));

        //遍历
        for(Student student :students){
            System.out.println(student);
        }
        //  使用泛型给HashMap 放入三个学生对象
        HashMap<String,Student> hm=new HashMap<String ,Student>();
        hm.put("milan",new Student("milan",12));
        hm.put("dulin",new Student("dulin",21));
        hm.put("roma",new Student("roma",34));
        //迭代器



    }
}
class Student{
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}