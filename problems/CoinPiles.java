import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            double a = Double.parseDouble(tokenizer.nextToken()); 
            double b = Double.parseDouble(tokenizer.nextToken());
            builder.append(check(a, b)).append("\n");
        }
        System.out.println(builder);
    }
    public static String check(double a, double b){
        if (a == 0 && b == 0)
            return "YES";
        return (((a / b) <= 2) && ((b / a) <= 2) && ((a + b) % 3 == 0)) ? "YES" : "NO";
    }
}