package utilizeArray;

public class Shuffle1 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numArr[i] = i;
            System.out.print(numArr[i]);
        }
        System.out.println(); // 개행

        // 교환 작업 50번 반복
        // 결국 배열의 첫번째 인덱스 값과 n번째 인덱스 값을 지속적으로 치환하는 작업
        for (int i = 0; i < 50; i++) {
            int n = (int) (Math.random() * 10); // 랜덤 인덱스 0~9
            int temp = numArr[0]; // 배열의 첫번째 값을 temp에 저장
            numArr[0] = numArr[n]; // 배열의 첫번째 값을 랜덤 인덱스 배열 값으로 변경
            numArr[n] = temp; // 랜덤 인덱스 배열의 값을 temp(배열의 첫번째 값)으로 변경
        }
        for(int i: numArr) {
            System.out.print(numArr[i]);
        }
    }
}
