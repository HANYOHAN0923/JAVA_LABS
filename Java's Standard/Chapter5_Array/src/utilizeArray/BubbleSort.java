package utilizeArray;

public class BubbleSort {
    public static void main(String[] args) {
        // 비효율적이지만 간단한 정렬 방법
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();


        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;    // 자리바꿈이 발생했는지를 체크하기 위해서, 매 반복마다 false로 초기화

            for (int n = 0; n < numArr.length -1 -i; n++) {
                if (numArr[n] > numArr[n+1]) {
                    int temp = numArr[n];
                    numArr[n] = numArr[n+1];
                    numArr[n+1] = temp;
                    changed = true;    // 자리바꿈이 발생했으니 값을 true로 바꾼다
                }
            }

            if(!changed) break;    // 자리바꿈이 없으면 반복문을 벗어난다.

            for (int k = 0; k < numArr.length; k++) System.out.print(numArr[k]);   // 정렬된 최종 배열 결과 출력
            System.out.println();
        }
    }
}
