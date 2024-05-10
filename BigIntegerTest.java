import java.util.*;
import java.math.*;
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int k = scan.nextInt();
        int n=scan.nextInt();

        BigInteger lotterOdds = BigInteger.valueOf(1);

        for(int i=1;i<=k;i++){
            lotterOdds =lotterOdds.multiply(BigInteger.valueOf(n-i+1).divide(BigInteger.valueOf(i)));
        }
        System.out.println(lotterOdds);
    }
}