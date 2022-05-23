package condition;

public class IfExample {
    public static void main(String[] args) {

        // 1~90 사이의 정수인 난수 생성
        int age = (int)(Math.random()*90)+1;
        int charge = 0;

        System.out.println(age);

        if (age < 8) {
            System.out.printf("미취학 아동: %d₩", charge);
        }
        else if (age >= 8 && age <= 19) {
            charge = 850;
            System.out.printf("청소년: %d₩",charge);
        }
        // 제어문에서 특정 조건에서 실행할 코드가 한 줄이라면 아래와 같이 표현할 수 있다.
        // 그렇지만 가독성을 위해서는 언제나 {}를 사용하는 것이 좋다
        else System.out.println("일반: 1250₩");
    }
}
