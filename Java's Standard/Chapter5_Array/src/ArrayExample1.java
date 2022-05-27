import java.util.*;

public class ArrayExample1 {
    public static void main(String[] args) {
        // 자료형[] 변수이름 = new 자로형[] {배열 초기화 값} => String[] member = new String[] {"chaewon","yuri","yena"};
        // 아래는 간단하게
        String[] member = {"chaewon","yuri", null};
        member[2] = new String("ye"); // String은 클래스이므로 new 연산자를 통해 객체를 생성하는 것이 맞지만
        member[2] = "yena"; // 특별히 String 클래스만 "yena"같이 큰 따옴표만으로 간략히 표현하는게 혀용된다.


        // 배열의 길이 = 배열 안의 요소의 개수
        System.out.println(member.length);

        // 배열의 요소 하나씩 출력
        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i]);
        }


        // java.util의 메서드를 사용해서 배열을 문자열("배열")로 출력
        System.out.println(Arrays.toString(member));
        // println()으로 배열 자체를 출력하면, 배열을 가르키는 참조변수의 값을 출력 => println()은 char 배열일 때만 작동
        System.out.println(member);

        char[] chArray = {'A', 'B', 'C', 'D'};
        System.out.println(chArray); // 배열의 요소가 출력된다
    }
}
