package classObject;

class Galaxy {
    String color;
    int storage;
    boolean status;

    void power() {
        status = !status;
        if (status) System.out.println("On-line");
        else System.out.println("Off-line");
    }
}

public class MyGalaxy {
    public static void main(String[] args) {
        Galaxy g;
        g = new Galaxy();

        g.color = "pink";
        g.storage = 256;
        g.status = true;
        g.power();
    }
}
