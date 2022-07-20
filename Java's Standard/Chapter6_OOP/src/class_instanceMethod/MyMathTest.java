package class_instanceMethod;

class MyMath {
    // 인스턴스 변수
    long a,b;

    // 인스턴스 메서드
    long add() {return a + b;}
    long subtract() {return a - b;}

    // 클래스 메서드
    static long multiply(long a, long b) {return a * b;}
    static double divide (double a, double b) {return a / b;}

}

public class MyMathTest {
    public static void main(String[] args) {
        // 클래스 메서드는 인스턴스의 생성과 관계 없이 호출 가능
        System.out.println(MyMath.divide(200.0, 100.0));
        System.out.println(MyMath.multiply(200L, 100L));

        // 인스턴스 메서드는 반드시 객체 생성 후에 호출이 가능
        MyMath mm = new MyMath();
        mm.a = 200L;
        mm.b = 100L;

        System.out.println(mm.add());
        System.out.println(mm.subtract());
    }
}