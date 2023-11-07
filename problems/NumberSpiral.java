import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < tests; i++) {
            String[] p = reader.readLine().split(" ");
            long y = Long.parseLong(p[0]);
            long x = Long.parseLong(p[1]);
            long result = get(y, x);
            output.append(result).append("\n");
        }
        
        
        System.out.println(output);
    }

    public static long get(long y, long x){
        long result = 0;
        if (x > y && x % 2 != 0) {
            result = x * x + (1 - y);
        }
        else if (x > y && x % 2 == 0 ){
            result = (x - 1) * (x - 1) + y;
        }
        else if (y >= x && y % 2 == 0){
            result = y * y + (1 - x);
        }
        else if (y >= x && y % 2 != 0){
            result = (y - 1) * (y - 1) + x;
        }
        return result;
    }
}