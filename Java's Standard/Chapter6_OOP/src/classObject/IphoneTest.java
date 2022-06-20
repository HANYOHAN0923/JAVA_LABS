package classObject;

class Iphone {
    int edition;
    String color;
    boolean power;

    void powerCheck() { power = !power; }
}

class IphoneTest {
    public static void main(String[] args) {
        Iphone i;           // ClassName VariableName; 클래스의 객체를 참조하기 위한 참조변수를 선언 (Iphone 인스턴스를 참조하기 위한 변수 i 선언)
        i = new Iphone();   // VariableName = new ClassName(); 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장 (Iphone 인스턴스 생성)
        i.color = "mint";       // Iphone 인스턴스의 맴버변수 color의 값을 "mint"로 초기화
        i.power = true;
        System.out.println(i.power);
        i.powerCheck();         // Iphone 인스턴스의 메서드 powerCheck()을 호출한다
        System.out.println(i.power);

    }
}
