package conversion;

public class ExplictConversion {
    public static void main(String[] args) {

        // bNum의 값이 이상하게 출력된다.
        int iNum = 1000;
        byte bNum = (byte)iNum;

        System.out.println(iNum);
        System.out.println(bNum);


        // 정수 부분 값만 가져오고, 소숫점 값은 유실된다.
        double dNum = 3.14;
        iNum = (int)dNum;

        System.out.println(iNum);


        float fNum =  0.9F;
        int num1 = (int)dNum +(int)fNum;
        int num2 = (int)(dNum +fNum);

        System.out.println(num1);
        System.out.println(num2);
    }
}
