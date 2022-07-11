package recursiveCall;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(Factorial(4));
    }

    static int Factorial(int x) {
        if (x == 1) return x;
        else return x*Factorial(x-1);
    };
}
