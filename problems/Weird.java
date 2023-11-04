package cses;

import java.util.Scanner;

public class Weird {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        while (true){
            System.out.print(n + " ");
            if (n == 1)
                break;
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
    }
}
