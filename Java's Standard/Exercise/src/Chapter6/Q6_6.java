package Chapter6;

public class Q6_6 {
    static double getDistance (int x, int y, int x1, int y1) { return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1)); }
    // return Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
    // Math.pow(double a, double b) => 제곱 (a = 밑, b = 지수)
    // Math.sqrt(double a) => 제곱근
    // Math.abs(double a) => 절대값

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
