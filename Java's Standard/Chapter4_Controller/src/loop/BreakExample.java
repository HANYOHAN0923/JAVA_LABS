package loop;

public class BreakExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (true) {
            sum += num;

            if (sum > 100) {
                break; // break는 해당 if가 아니라 반복문을 탈출한다.
                // 중첩된 반복문의 경우, 자신이 속해있는 반복문을 빠져나옴
            }

            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
