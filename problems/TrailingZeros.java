import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class TrailingZeros{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(reader.readLine()), b = getBasis(num), result = 0;
        for (long i = 1; i <= b; i++)
            result+=(Math.floor((double) num / Math.pow(5, i)));
        System.out.println(result);
    }

    public static long getBasis(long n){
        long basis = 0;
        while (n >= 5){
            basis+=1;
            n/=5;
        }
            
        return basis;
    }
}