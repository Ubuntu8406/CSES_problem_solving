import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations{
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuffer firstPart = new StringBuffer(),
         secondPart = new StringBuffer();
        if (n == 1){
            System.out.println(1);
        }else if(n < 4) {
            System.out.println("NO SOLUTION");
        }else{
            for (int i = 1; i <= n; i+=2) {
                firstPart.append((i) + " ");
                if (n + 1 != i + 1) {
                    secondPart.append((i+1) + " ");
                }
            }
            System.out.println(secondPart.append(firstPart));
        }
    }
}