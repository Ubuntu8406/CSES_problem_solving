import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        long progression = n * (n + 1)/2;
        StringBuilder s1 = new StringBuilder(), 
        s2 = new StringBuilder();
        int count1 = 0, count2 = 0;
        String result = "NO";
        if (progression % 2 == 0) {
            result = "YES";
            long half = progression / 2;
            for (long i = n; i >= 1; i--) {
                if (i <= half) {
                    s1.append(i).append(" ");
                    half = half - i;
                    count1++;
                }
                else if (i != half){
                    count2++;
                    s2.append(i).append(" ");
                }
            }
             System.out.println(result);
             System.out.println(count1);
             System.out.println(s1);
             System.out.println(count2);
             System.out.println(s2);
        } else {
            System.out.println(result);
        }
    }
}
