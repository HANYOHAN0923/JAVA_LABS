package binary;

public class ComplementExample {
    public static void main(String[] args) {
        int num = 0B00000000000000000000000000000101;
        int compleNum  = 0B11111111111111111111111111111011;

        int sum = num + compleNum;

        System.out.println(num);
        System.out.println(compleNum);
        System.out.println(sum);
    }
}
