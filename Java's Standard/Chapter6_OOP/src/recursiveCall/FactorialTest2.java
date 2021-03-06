package recursiveCall;

public class FactorialTest2 {
    static long Factorial(int n) {
        if (n < 0 || n > 20) return -1;
        else if (n==1) return 1;
        else return n*Factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for (int i = 1; i <= n ; i++) {
            result = Factorial(i);

            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<=20):%d%n",n);
                break;
            }

            System.out.printf("%2d!=%20d%n", i, result);

        }
    }
}
