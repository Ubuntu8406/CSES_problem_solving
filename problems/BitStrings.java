import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        System.out.println(pow(2, n));
}
    public static long pow(long x, long n){
        long result = 1, m = 1000000007;
        for (long i = 0; i < n; i++) {
            result *= x;
            if (result > m) {
                result%=m;
            }
        }
        return result;
    }
}
