import java.util.*; // Scanner 사용을 위해서 추가



public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 클래스의 객체 scanner를 생성

        System.out.println("Pls input double digits integer:");
        String input = scanner.nextLine(); // 변수 input에 입력받은 내용을 저장 (코드 실행 후, 사용자 입력까지 대기)
        int num = Integer.parseInt(input); // 입력 받은 문자열을 숫자로 전환

        System.out.printf("Result: %d", num);
    }
}
