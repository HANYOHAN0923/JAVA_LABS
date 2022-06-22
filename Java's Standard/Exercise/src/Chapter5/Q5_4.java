package Chapter5;

public class Q5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }

        // int / float => float / float으로 자료형 변환
        // 만약 이차원배열의 각 요소인 배열들의 길이가 다르다면 for문 안에서 하나하나 변수 개수를 카운트 해줘야함
        average = total / (float)(arr.length*arr[0].length);

        System.out.println("total="+total);
        System.out.println("average="+average);
    }
}
