package utilizeArray;

public class TotalAverage {
    public static void main(String[] args) {
        int total = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for(int i : score) {
            total += i;
        }
        System.out.println(total);

        average = total / (float)score.length;  // 계산결과를 float으로 얻기 위해서 형변환
        System.out.println(average);
    }
}
