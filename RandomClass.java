import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random(2022);

        // 生成5个整数并打印输出
        System.out.println("生成的5个整数：");
        for (int i = 0; i < 5; i++) {
            int randInt = random.nextInt();
            System.out.println(randInt);
        }

        // 生成5个double类型并打印输出
        System.out.println("生成的5个double类型：");
        for (int i = 0; i < 5; i++) {
            double randDouble = random.nextDouble();
            System.out.println(randDouble);
        }
    }
}
