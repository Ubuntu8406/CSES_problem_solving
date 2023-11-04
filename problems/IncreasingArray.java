import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long move = 0;
        long previous = Long.parseLong(tokenizer.nextToken());
        while (tokenizer.hasMoreTokens()){
            long current = Long.parseLong(tokenizer.nextToken()), currentMove = 0;
            if (previous > current) {
                currentMove = previous - current;
                move += currentMove;
            }
            previous = current+currentMove;
        }
        System.out.println(move);
    }
}
