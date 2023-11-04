import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long maxLength = 1, currentLength = 1;
        char[] dna = reader.readLine().toCharArray();
        int point = 1;
        while (point < dna.length){
            char current = dna[point], previous = dna[point-1];
            if (current == previous){
                currentLength++;
            }
            else{
                currentLength = 1;
                if ((dna.length - point) < maxLength)
                    break;
            }
            if (currentLength > maxLength)
                maxLength = currentLength;
            point++;
        }
        System.out.println(maxLength);
    }
}