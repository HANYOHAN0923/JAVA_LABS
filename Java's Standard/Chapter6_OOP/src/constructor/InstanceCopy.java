package constructor;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white","auto",4);
    }

    Car (Car c) {   // 인스턴스의 복사를 위한 생성자
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car (String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class InstanceCopy {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);   // c1의 복사본 c2를 생성한다. 즉 2번째 생성자가 생성된 것이지

        System.out.println("c1.color: " + c1.color + ", c1.gearType: " + c1.gearType + ", c1.door: " + c1.door);
        System.out.println("c2.color: " + c2.color + ", c2.gearType: " + c2.gearType + ", c2.door: " + c2.door);

        c1.door = 100;
        System.out.println("c1.door=100; 실행 후");
        System.out.println("c1.color: " + c1.color + ", c1.gearType: " + c1.gearType + ", c1.door: " + c1.door);
        System.out.println("c2.color: " + c2.color + ", c2.gearType: " + c2.gearType + ", c2.door: " + c2.door);
    }
}
