
import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value1  = scanner.nextInt();
        int value2 = scanner.nextInt();
        // ---------------------Begin------------------------
        /**
         1.求出变量value1的绝对值
         2.求出value1的3次幂
         3.求出value1的二次方根
         4.求出value1的sin值
         5.求出value1与value2中的较大者
         * */
        // ---------------------Begin------------------------
        System.out.println("value1的绝对值：" + Math.abs(value1));
        System.out.println("value1的3次幂：" + Math.pow(value1, 3));
        System.out.println("value1的二次方根：" + Math.sqrt(value1));
        System.out.println("value1的sin值：" + Math.sin(value1));
        System.out.println("value1与value2中的较大者：" + Math.max(value1, value2));
// ---------------------End------------------------




        // ---------------------End------------------------
    }
}
