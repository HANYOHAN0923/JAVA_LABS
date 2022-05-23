package loop;

public class DoubleLoopFor {
    public static void main(String[] args) {
        int level;
        int times;
        for (level = 2; level <= 9; level++) {
            for (times = 1; times <= 9; times++) {
                System.out.println(level * times);
            }
        }
    }
}
