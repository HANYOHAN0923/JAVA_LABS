package utilizeArray;

public class MaxMin {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        // 비교를 위해 초기화
        int max = score[0];
        int min = score[0];

        for ( int i = 0; i < score.length;  i++ ) {
            if (score[i] > max){
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            } else {
                continue; // 생략 가능
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
