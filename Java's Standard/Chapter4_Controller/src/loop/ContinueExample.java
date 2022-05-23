package loop;

public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 1; num <= 100; num++) {
            if ((num % 2) == 0) {
                sum += num;
            } else {
                continue; // continue는 증감식으로 돌아감
            }
        }

        System.out.println(sum);
    }
}
