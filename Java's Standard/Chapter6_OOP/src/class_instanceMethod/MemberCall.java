package class_instanceMethod;

public class MemberCall {
    int iv = 10;        // 인스턴스 변수
    static int cv = 20; // 클래스 변수

    int iv2 = cv;
    // static int cv2 = iv; Error: 클래스 변수는 인스턴스 변수를 사용할 수 없음
    static int cv2 = new MemberCall().iv;   // 이렇게 객체를 생성해야 사용가능


    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); Error: 클래스 메서드에서 인스턴스 변수 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv);   // 객체를 생성한 후에 인스턴스 변수 참조 가능
    }

    // 변수 제약이 없는 인스턴스 메서드
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); Error: 클래스 메서드에서는 인스턴스 메서드 호출 불가
        MemberCall c = new MemberCall();
        c.instanceMethod1();    // 인스턴스를 생성한 후에 호출 가능
    }

    // 메서드 호출에 제약이 없는 인스턴스 메서드
    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
