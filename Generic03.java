package generic;
//泛型的作用是：可以在类的声明时通过一个标识表示类中某一个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person=new Person<String>("hello");
        person.show();
        Person<Integer> person2=new Person<Integer>(100);
        person2.show();

    }
}
class Person<E>{
    E e;//E 表示e 的数据类型，在编译期间确定

    public Person(E e) {
        this.e = e;
    }
    public E f(){
        return e;
    }
    public void show(){
        System.out.println(e.getClass());
    }
}
