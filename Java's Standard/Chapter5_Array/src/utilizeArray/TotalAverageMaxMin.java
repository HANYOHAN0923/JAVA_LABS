package utilizeArray;

public class TotalAverageMaxMin {
    public static void main(String[] args) {
        int[] score = {95, 100, 98, 99, 93, 100};
        int total = 0;
        float average = 0f;
        int max = score[0];
        int min = score[0];

        // 총합 구하기
        for(int i : score) {
            total += i;
        }
        System.out.println(total);  // result: 585


        // 총합 / 배열길이로 평균 값 구하기
        average = total / (float)score.length;  // 계산결과를 float으로 얻기 위해서 형변환
        System.out.println(average);    // result: 97.5


        // 최대 값과 최저 값 구하기
        for (int i : score) {   // i는 반복문을 돌면서, score배열의 요소를 값으로 차례대로 한번씩 갖는다
            if (i > max) max = i;   // score 배열 중 특정 요소의 값이 max보다 클 경우, max값을 i값으로 업데이트
            else if (min > i) min = i;  // score 배열 중 특정 요소의 값이 min보다 작을 경우, min값을 i값으로 업데이트
            else continue;  // 그 어느 조건에도 해당 안될 경우, for문으로 이동
        }
        System.out.println(max);    // result: 100
        System.out.println(min);    // result: 93
    }
}
