package Chapter4;

public class Q4_11 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번재 값
        System.out.print(num1+","+num2);

        for (int i = 0; i < 8; i++) {
            num3 = num1 + num2;
            System.out.print(","+num3);

            // Finobbaci의 n번째 값은 (n-2)번째 값 + (n-1)번쨰 값이라는 것을 활용해서, 값을 업데이트
            num1 = num2;
            num2 = num3;
        }
    }
}
