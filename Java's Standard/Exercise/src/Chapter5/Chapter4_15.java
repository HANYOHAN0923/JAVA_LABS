package Chapter5;

public class Chapter4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int temp = number;

        int result = 0;

        while(temp != 0) {
            // 원리: temp%10 number의 n번째 수를 가져온다, result*10은 n+1번째 수에 10을 곱해서 자리수를 앞으로 보내준다.
            // n+1번째 수의 자릿수를 10을 곱함을 통해 계속 자릿수를 올려주고, 거기에 n번째 수를 더하는 것을 통해 정수를 반대로 만들 수 있다
            result = result*10 + temp%10;
            temp /= 10;
        }

        if(number==result) System.out.println(number+"는 회문수 입니다.");
        else System.out.println(number+"는 회문수가 아닙니다.");
    }
}
