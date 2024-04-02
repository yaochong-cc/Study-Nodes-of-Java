////private字段不能直接修改，但是可以通过方法间接修改
//
//public class Main {
//    public static void main(String[] args) {
//        Person ming = new Person();
//        ming.setName("Xiao Ming"); // 设置name
//        ming.setAge(120); // 设置age
//        System.out.println(ming.getName() + ", " + ming.getAge());
//    }
//};
//
//class Person {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        if (age < 0 || age > 100) {
//            throw new IllegalArgumentException("invalid age value");// 抛出一个非法参数异常，显示"invalid age value"
//        }
//        this.age = age;
//    }
//}
////虽然外部代码不能直接修改private字段，
//// 但是，外部代码可以调用方法setName()和setAge()来间接修改private字段。
//
//
//




////private方法
////有public方法，自然就有private方法。和private字段一样，private方法不允许外部调用，那我们定义private方法有什么用？
////定义private方法的理由是内部方法是可以调用private方法的。
//public class Main {
//    public static void main(String[] args) {
//        Person ming = new Person();
//        ming.setBirth(2008);
//        System.out.println(ming.getAge());//11
//    }
//}
//
//class Person {
//    private String name;
//    private int birth;
//
//    public void setBirth(int birth) {
//        this.birth = birth;//2008
//    }
//
//    public int getAge() {
//        return calcAge(2019); // 调用private方法//2019-2008=11
//    }
//
//    // private方法:
//    private int calcAge(int currentYear) {
//        return currentYear - this.birth;//2019-2008=11
//    }
//}




////参数绑定
//public class Main {
//    public static void main(String[] args) {
//        Person p = new Person();
//        int n = 15; // n的值为15
//        p.setAge(n); // 传入n的值
//        System.out.println(p.getAge()); // 15
//        n = 20; // n的值改为20//改变的是外部的参数，但是实例p的age字段的值并没有改变
//        System.out.println(p.getAge()); // 15还是20?//还是15！！
//
//        //改变实例p的age字段的值
//        p.setAge(n); // 传入n的值
//        System.out.println(p.getAge()); // 20！！
//    }
//}
//
//class Person {
//    private int age;
//
//    public int getAge() {
//        return this.age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
////修改外部的局部变量n，不影响实例p的age字段，原因是setAge()方法获得的参数，复制了n的值，因此，p.age和局部变量n互不影响。
////结论：基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。








////引用类型的参数绑定
//public class Main {
//    public static void main(String[] args) {
//        Person p = new Person();
//        String[] fullname = new String[] { "Homer", "Simpson" };
//        p.setName(fullname); // 传入fullname数组
//        System.out.println(p.getName()); // "Homer Simpson"
//        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
//        System.out.println(p.getName()); // "Homer Simpson"还是"Bart Simpson"?// 为什么是"Bart Simpson"?
//        //引用类型时pass by reference，修改外部变量的值，会影响到实例变量的值。
//        //这是和基础数据类型不同的地方。
//    }
//}
//
//class Person {
//    private String[] name;
//
//    public String getName() {
//        return this.name[0] + " " + this.name[1];
//    }
//
//    public void setName(String[] name) {
//        this.name = name;
//    }
//}


////字符串的参数绑定
//public class Main {
//public static void main(String[] args) {
//    Person p = new Person();
//    String bob = "Bob";
//    p.setName(bob); // 传入bob变量
//    System.out.println(p.getName()); // "Bob"
//    bob = "Alice"; // bob改名为Alice
//    System.out.println(p.getName()); // "Bob"还是"Alice"?//还是"Bob"?
//   //字符串pass by reference，但是字符串不可变。！！！
//}
//}
//
//class Person {
//    private String name;
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}