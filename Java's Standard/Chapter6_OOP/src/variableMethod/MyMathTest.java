package variableMethod;

// 같은 클래스 내의 메서드끼리는 참조변수를 사용하지 않고도 서로 호출이 가능하지만 static 메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다

public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L); // double 대신 long값으로 호출하였다. long은 double로 묵시적 형변환 발생

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

class MyMath {
    long add (long a, long b) {return a + b;}
    long subtract (long a, long b) {return a - b;}
    long multiply (long a, long b) {return a * b;}
    double divide(double a, double b) {return a / b;}
}
