package classObject;// Tv 클래스는 TvTest.java에 이미 있음

public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();   // 1) Tv t1; 2) t1 = new Tv();를 한문장으로 작성
        Tv t2 = new Tv();

        System.out.println("t1: Channel on "+ t1.channel);
        System.out.println("t1: Channel on " + t2.channel);

        // 같은 클래스로부터 생성되었을지라도 각 인스턴스의 속성(멤버변수)은 서로 다른 값을 유지할 수 있다
        // 메서드의 내용은 모든 인스턴스에 대해 동일하다
        t1.channel = 4;
        System.out.println("t1: Channel on "+ t1.channel);
        System.out.println("t1: Channel on " + t2.channel);
    }
}
