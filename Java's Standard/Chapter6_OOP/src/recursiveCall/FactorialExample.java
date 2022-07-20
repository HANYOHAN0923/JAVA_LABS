package recursiveCall;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = Factorial(n);

        if (result == 0) {
            System.out.println("Invalid Value");
            System.exit(0);
        }
        System.out.println(result);
    }

    static int Factorial(int n) {
        if (n < 0 || n >= 20) return 0;
        else if (n == 1) return 1;
        return n * Factorial(n-1);
    }

}
