package variableMethod;

// 매개변수 유효성 검사는 메서드 작성에 있어서 매우 중요한 부분이다. 큰 규모의 코드에서는 꼭 포함시키도록 하자

public class ReturnParameterValid {

    static float divide(int x, int y) {
        if (y == 0) {
            System.out.println("Can not dived with Zero");
            return 0; // 매개변수가 유효하지 않으므로 메서드를 종료할 때 사용
        }

        return x / (float) y;
    }

    public static void main(String[] args) {

    }
}
