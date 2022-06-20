package classObject;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1: Channel on "+ t1.channel);
        System.out.println("t1: Channel on " + t2.channel);

        t2 = t1;            // t1이 저장하고 있는 값(메모리 주소)을 t2에 저장
        // t2가 원래 참조하고 있던 인스턴스의 값은 더 이상 사용할 수 없게 된다. (그 누구도 주소를 몰라)
        // 즉 t1과 t2 모두 같은 Tv클래스의 인스턴스의 주소를 갖고 있는다.
        // 하나의 인스턴스를 여러 개의 참조변수가 가르키는 것은 가능하지만, 여러 인스턴스를 하나의 참조변수가 가르키는 것은 불가능하다
        t1.channel = 7;
        System.out.println("t1: Channel on "+ t1.channel);
        System.out.println("t1: Channel on " + t2.channel);
    }
}
