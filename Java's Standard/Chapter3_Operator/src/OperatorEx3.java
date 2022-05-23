public class OperatorEx3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int result = num1 & num2;
        int result2 = num1 | num2;
        int result3 = num1 ^ num2;

        int number = 10;
        int res_number = ~number;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println(res_number);

        int shift_num = 5;
        System.out.println(shift_num);
        System.out.println(shift_num << 1); // 원래 결과에서 2의 n승 만큼 곱해진 결과와 같다
        System.out.println(shift_num<<=1); // 복합대입 연산자
        System.out.println(shift_num);

        int shift_num2 = 5; // 나누기 2의 n승의 효과가 있다.
        System.out.println(shift_num2 >> 1); // 00000010 : 2으로 변환
    }
}
