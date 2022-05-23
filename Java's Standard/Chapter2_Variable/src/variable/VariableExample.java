package variable;

public class VariableExample {
    public static void main(String[] args) {
        // byte dataType = 128; => Error (int를 사용해야한다)
        byte dataType = 127;

        // 소수의 기본형은 int(4byte)이기 때문에 long(8byte)으로 선언할 때는 식별자 L을 사용해야한다.
        long num = 12345678900L;

        System.out.println(num);

        // 다른 자료형 또한 마찬가지이다
        double dNum = 3.14;
        float fNum = 3.14F;

        System.out.println(dNum);
        System.out.println(fNum);
    }
}
