package classObject;

class Tv {
    // Tv의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능 (메서드)
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}


public class TvTest {
    public static void main(String[] args) {
        Tv t;                   // Tv인스턴스를 참조하기 위한 변수 t를 선언
        // 메모리에 참조변수 t를 위한 공간이 마련된다. 아직 인스턴스가 생성되지 않았으므로 참조변수로 아무것도 할 수 없다
        t = new Tv();           // Tv인스턴스를 생성한다
        // 연산자 new에 의하여 Tv클래스의 인스턴스가 메모리 빈 공간에 생성된다. 이 때, 멤버변수는 각 자료형에 해당하는 기본값으로 초기화 된다.
        // color는 참조형이라 null, power는 boolean이므로 false, channel은 int이므로 0으로 초기화된다. 이 객체는 주소 값을 갖는다
        // 그 다음 대입연사자(=)에 의해서 생성된 객체의 주소값이 참조변수 t에 저장된다. 이제는 참조 변수 t를 통해서 Tv인스턴스에 접근할 수 있다.
        // 즉 t에는 객체가 아니라 Tv인스턴스의 주소를 값으로 갖고 있어서, t를 통해서 Tv인스턴스에 접근할 수 있는 것이다
        t.channel = 7;          // Tv인스턴스의 멤버변수 channel의 값을 7로 한다
        // 참조변수.멤버변수를 통해 인스턴스의 멤버변수(속성)에 접근할 수 있다.
        t.channelDown();        // Tv인스턴스의 메서드 channelDown()을 호출한다
        // 동일하게 참조변수.메서드를 통해 인스턴스의 메서드를 호출할 수 있다
        System.out.printf("Now on Channel %d",t.channel);
    }
}
