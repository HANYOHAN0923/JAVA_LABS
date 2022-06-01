package utilizeArray;

public class BubbleSort {
    public static void main(String[] args) {
        // 비효율적이지만 간단한 정렬 방법
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

        Loop1: for (int i = 0; i < numArr.length - 1; i++) {    // 큰 값을 뒤로 보내는 Loop2의 작업을 지속적으로 하는 반복문
            boolean changed = false;    // 자리바꿈이 발생했는지를 체크하기 위해서, 매 반복마다 false로 초기화

            // 여기서 -1에 -i를 추가하는 이유는, 우선 이 반복문은 큰 값은 뒤로 자리가 이동되는 구조를 가지고 있다. 따라서 Loop1의 반복문이 한번 돌때마다,  가장 큰 값부터 뒤에서 정렬되기 때문에 굳이 가장 끝까지 비교하는 것은 시간 낭비이다.
            Loop2: for (int n = 0; n < numArr.length -1 -i; n++) {  // 실질적인 자리 바꿈 반복문
                if (numArr[n] > numArr[n+1]) {
                    int temp = numArr[n];
                    numArr[n] = numArr[n+1];
                    numArr[n+1] = temp;
                    changed = true;    // 자리바꿈이 발생했으니 값을 true로 바꾼다
                }
            }

            if(!changed) break;    // 만약 정렬이 완료되면 Loop2는 실행되나, 그 안의 if문은 실행 안된다. 따라서 changed는 false이다(Loop1 돌 때마다 changed는 false로 초기화). 그래서 반복문 중도 탈출 -> 사실 이것 없이 반복문을 다 돌아도 되지만 조금이라도 코드 실행시간을 단축하기 위함이다.

            for (int k = 0; k < numArr.length; k++) System.out.print(numArr[k]);   // 정렬된 최종 배열 결과 출력
            System.out.println();
        }
    }
}