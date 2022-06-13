package Chapter4;

public class Q4_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;


        // 반복문과 charAt()을 이용해서 문자열의 문자를 하나씩 읽어서 검사
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i)-ch > 25) isNumber = false;
            break;  // 중간에 숫자가 아닌 문자가 나왔을 때 break로 탈출 처리를 해주면 시간 감소가 가능하다
        }

        /* Method2
        ch = value.charAt(i);

        for (int i = 0; i < value.length(); i++) {
            if ( '0' < ch && ch < '9') isNumber = false;
            break;
        }
         */

        if (isNumber) System.out.println(value+"는 숫자입니다.");
        else System.out.println(value+"는 숫자가 아닙니다.");
    }
}
