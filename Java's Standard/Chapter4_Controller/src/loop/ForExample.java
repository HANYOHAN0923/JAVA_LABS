package loop;

public class ForExample {
    public static void main(String[] args) {
        /*
        for문 구조
        for (초기화식; 조건식; 증감식) {
            // 반복해서 실행할 코드
        }
        1) for문은 주로 배열과 많이 사용되는 반복문
        2) 초기화식의 매개변수와, 증감식의 항은 ','로 추가할 수 있다
            => for (num =1, sum = 0; ...) 이런식으로 말이다.
         */
        int num;
        int sum = 0;

        // 아래 코드는 for (int i = 1; i <= 10, i++)와 동일한 코드이다.
        // 그렇지만 초기화식의 매개변수 값은 0부터 시작하는게 국룰이다.
        for (num = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println(sum);
        System.out.println(num);
    }
}
