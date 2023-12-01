import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PalindromeReorder{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        StringBuilder tail = new StringBuilder();
        StringBuilder center = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        int countOfOdd = 0;
        for (char ch : input) {
            Character c = new Character(ch);
            if (!map.containsKey(c)) {
                map.put(c, 1);
                countOfOdd++;
            }
            else {
                Integer i = Integer.valueOf(map.get(c)+1);
                map.replace(c, i);
                if (i.intValue() % 2 != 0) {
                    countOfOdd++;
                }else if (i.intValue() % 2 == 0) {
                    countOfOdd--;
                }
            }
        }

        if (countOfOdd > 1) {
            System.out.println("NO SOLUTION");
        }else{
            for (Character i : map.keySet()) {
                int current = map.get(i);
                if (current % 2 != 0) {
                    for (int j = 0; j < current; j++)
                        center.append(i);
                }else{
                    for (int j = 0; j < current/2; j++) {
                        tail.append(i);
                    }
                }
            }

        }
        System.out.print(tail);
        System.out.print(center);
        System.out.println(tail.reverse());
    }
}