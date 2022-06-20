package Chapter4;

// [Hint] 나머지 연산자 이용하세요.

public class Q4_15 {
    public static void main(String[] args) {
        int number =12321;
        int temp = number;

        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        // Q4_10과 같은 방식으로 나머지 연산자를 통해서 마지막 자리 숫자를 가져온다
        // 10을 곱해가면서 result에 더하는 것을 통해서 숫자를 역순으로 바꿀 수 있다
        while(temp != 0) {
            result = result*10 + temp % 10;
            temp /= 10;
        }

        if (number == result) System.out.println(number+"는 회문수 입니다");
        else System.out.println(number+"는 회문수가 아닙니다.");
    }
}
