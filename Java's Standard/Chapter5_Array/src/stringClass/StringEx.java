package stringClass;

public class StringEx {
    public static void main(String[] args) {
        // String클래스는 char 배열에 메서드를 추가한 것이다

        String str = "Java"; // 사실상 이 코드는 String객체(문자열)을 생성하는 것과 동일하다
        str = "자바"; // 이 코드는 String객체의 내용을 변경한 것이 아니라, str에 새로운 String객체 값을 저자한 것이라고 생각해야한다
        System.out.println(str);
    }
}
