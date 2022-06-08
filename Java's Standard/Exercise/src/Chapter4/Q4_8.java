package Chapter4;

public class Q4_8 {
    public static void main(String[] args) {
        for (int x = 0; x < 11; x++){
            for (int y = 0; y < 11; y++) if (x*2 + y*4 == 10) System.out.printf("x = %d, y = %d%n",x,y);
        }
    }
}
