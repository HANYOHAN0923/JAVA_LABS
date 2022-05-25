import java.util.*;

public class ArrayExample1 {
    public static void main(String[] args) {
        // 자료형[] 변수이름 = new 자로형[] {배열 초기화 값} => String[] member = new String[] {"chaewon","yuri","yena"};
        // 아래는 간단하게
        String[] member = {"chaewon","yuri","yena"};


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
