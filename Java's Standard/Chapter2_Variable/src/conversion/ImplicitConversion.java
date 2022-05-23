package conversion;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum;

        System.out.println(num);

        /*
        lNum은 8바이트 정수이지만, float는 4byte 실수이기 때문에 더 정밀한 수여서 묵시적 형변환이 자연스럽게 일어난다.
        따라서 fNum은  lNum의 값을 받지만, 실제로 저장되는 값은 float으로 인하여 10.0이 저장된다.
         */
        long lNum = 10;
        float fNum = lNum;

        System.out.println(fNum);

        /* 아래 과정에서 일어나는 묵시적 형변환
        1. 우선 num은 정수, fNum은 실수이다. 다른 자료형간의 연산은 이루어질 수 없기 때문에 형변환이 필요하다.
        따라서 덜 정밀한 num이 실수로 정밀해지는 묵시적 형변환이 일어난다. 그 후 fNum과 num의 연산이 이루어진다.
        2. fNum은 float이다. 그렇지만 실제로 연산된 값을 저장할 변수 dNum은 double로 선언이되어있다.
        double은 float보다 정밀하기 때문에 여기서 또한번의 묵시적형변환이 일어난다.
         */
        double dNum = fNum + num;
        System.out.println(dNum);

        byte xNum = (byte)num;
        System.out.println(xNum);
    }
}
