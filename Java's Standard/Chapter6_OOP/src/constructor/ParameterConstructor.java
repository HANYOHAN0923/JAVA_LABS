package constructor;

class Phone {
    String color;
    int version;

    Phone() {}

    Phone(String c, int v) {
        color = c;
        version = v;
    }
}

public class ParameterConstructor {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.color = "SpaceGrey";
        p1.version = 13;
        System.out.println(p1.color + ", " + p1.version);

        Phone p2 = new Phone("SpaceGrey",13);
        System.out.println(p2.color+", "+p2.version);

        Phone p3 = new Phone("Black",12);
        System.out.println(p3.color + ", " + p3.version);
    }
}
