package initializeVariable;

class Car {
    int serialNo;
    int count;
    String color;
    String gearType;

    {   // 인스턴스 초기화 블럭
        count++;
        serialNo = count;
    }

    Car() {
        // count++;
        // serialNo = count;
        color = "White";
        gearType = "Auto";
    }

    Car(String color, String gearType) {
        // count++;             위와 중복되는 코드1
        // serialNo = count;    위와 중복되는 코드2
        this.color = color;
        this.gearType = gearType;
    }
}

public class InstanceInitialiazationBlock {
}
