public class ArrayExample2 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};

        String[] binary =
                {"0000","0001","0010","0011",
                "0100","0101","0110","0111",
                "1000","1001","1010","1011",
                "1100","1101","1110","1111"};

        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] > '0' && hex[i] < '9') {    // 숫자의 경우 | 비교 원리는 UNICODE: 아스키코드 참조
                result += binary[hex[i]-'0'];   // if문이 실행된 적 없음
            } else { // 알파벳의 경우
                result += binary[hex[i]-'A'+10];    // else문에서 A라고 가정했을 때 result = 'A' - 'A' + 10 = 10이다. binary[10]은 1010(2) = 10이다. 인덱스 값은 0부터 시작
            }
        }

        System.out.println("hex:"+new String(hex));
        System.out.println("binary:" + result);
        System.out.println("0000");
    }
}
