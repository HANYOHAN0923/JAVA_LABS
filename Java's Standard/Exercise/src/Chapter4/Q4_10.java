package Chapter4;

public class Q4_10 {
    public static void main(String[] args) {
        // 문자열로 변환 금지
        int num = 12345;
        int sum = 0;

        while(num>0) {
            sum += num%10;
            num /= 10;
        }

        /*
        핵심은 마지막 숫자를 하나씩 뽑아내는 것이다.
        12345를 10으로 나누고 나머지만 가져오면 5가 된다. 이렇게 마지막 자리의 나머지를 가져오는 것이다.
        그 다음 마지막 나머지는 4이다. 이것을 가져오기 위해서 12345를 10으로 나누고 몫만 가져오면 1234가 된다.
        1234를 while문으로 똑같이 반복작업을 하면 계속적으로 마지막 수를 가져올 수 있는 것이다.
         */

        System.out.println("sum="+sum);
    }
}
