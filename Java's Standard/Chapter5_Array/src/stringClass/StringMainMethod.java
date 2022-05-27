package stringClass;

import java.util.*;

public class StringMainMethod {
    public static void main(String[] args) {
        // char charAt(int index) => 문자열(strObj)에서 해당 위치(index)에 있는 문자를 반환한다
        String str = "ABCDE";

        System.out.println(str.charAt(2));

        char ch = str.charAt(3);
        System.out.println(ch);

        // int length() => 문자열의 길이를 반환한다
        System.out.println(str.length());

        int len = str.length();
        System.out.println(len);

        // String substring(int from, int to) => 문자열에서 해당 범위(from ~ to)에 있는 문자열을 반환한다 * to는 범위에 미포함
        String str1 = "12345";
        String temp = str1.substring(1,4);
        System.out.println(temp);

        System.out.println(str1.substring(0,2));

        // boolean equals(Object obj) => 문자열의 내용이 obj와 같은지 확인한다. 같으면 true, 다르면 false를 반환한다
        String str2 = "abc";

        if (str2.equals("abc")) System.out.println("Same");

        // char[] toCharArray() 문자열을 문자배열(char[])로 변환해서 반환한다
        String greet = "Hello World";
        char[] charArr = greet.toCharArray();
        System.out.println(Arrays.toString(charArr)); // 배열을 직접적으로 보고 싶다면 import를 통한 toString() 메소드가  필요하다

        // char 배열을 문자열로 변환
        String greet2 = new String(charArr);
        System.out.println(greet2);
    }
}
