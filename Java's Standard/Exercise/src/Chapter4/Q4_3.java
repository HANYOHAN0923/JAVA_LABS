package Chapter4;

public class Q4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i < 11; i++) {
            sum += i; // sum = i이면 1,2,3,4... 이렇게 차례대로 값이 나오지만, += i라서, 1. 1+2, 1+2+3, 1+2+3+4... 이렇게 값이 나온다
            totalSum += sum;
        }

        System.out.println(totalSum);
        System.out.println(sum);
    }
}
