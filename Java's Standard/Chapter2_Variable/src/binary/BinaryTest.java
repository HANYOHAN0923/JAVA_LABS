package binary;

public class BinaryTest {
    public static void main(String[] args) {
        int num = 10;   // 10진수
        int bNum = 0B1010;  //  2진수 => 0B
        int oNum = 012;     // 8진수 => 0
        int hNum = 0XA;     // 16진수 => 0X

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(hNum);
    }
}
