package loop;

public class WhileExample {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        /*
        1) while문은 주로 무한 루프에서 사용된다.
        2) while문은 주로 true와 false로 조건식이 나타나는 경우 사용한다.

        - do-while과 while의 차이
        do-while은 조건에 상관 없이, 무조건 한번을 반복한다. while은 조건이 안 맞으면 아예 실행이 안됨
         */

        do {
            sum += num;
            num++;
        } while (num <= 10);

        System.out.println(sum);
        System.out.println(num);
    }
}
