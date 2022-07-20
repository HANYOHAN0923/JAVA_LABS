package constructor;

class Iphone {
    String color;
    int version;

    // 생성자1
    /*Iphone() { this("Starlight", 13); }*/

    /*Iphone(String color) {
        this(color,13);
    }*/

    Iphone() {
        this.color = "Starlight";
        this.version = 13;
    }

    Iphone(String color) {
        this.color = color;
        this.version = 31;
    }

    Iphone(String color, int version) {
        this.color = color;
        this.version = version;
    }
}

public class ThisEx {
    public static void main(String[] args) {
        Iphone i1 = new Iphone();
        System.out.println(i1.color + ", " + i1.version);

        Iphone i2 = new Iphone("Midnight");
        System.out.println(i2.color + ", " + i2.version);
    }
}
