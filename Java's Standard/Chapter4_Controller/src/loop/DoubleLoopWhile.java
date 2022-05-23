package loop;

public class DoubleLoopWhile {
    public static void main(String[] args) {
        int level = 2;
        int times;
        int value;
        while (level <= 9) {
            times = 1;
            while (times <= 9) {
                value = level * times;
                System.out.println(String.format("%d x %d = %d", level, times, value));
                times++;
            }
            level++;
            System.out.println();
        }
    }
}
