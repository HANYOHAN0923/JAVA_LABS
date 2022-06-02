package multiDimensional;

public class MultiDimensionalArrayEx {
    public static void main(String[] args) {
        // 좌표라고 생각하면 편하다 [y축 좌표][x축 좌표]
        int[][] mulArray = new int[4][3]; // column 행의 길이가 4(세로), row 열의 길이가 3(가로)인 2차원 배열

        // 2차원 배열은 행과 열로 구성되어 있기 때문에 index도 행과 열에 각각 하나씩 존재한다.
        mulArray[0][0] = 100;    // arrayName[columnIndex][rowIndex]식으로 배열의 요소에 접근할 수 있다

        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        // 2차원 배열 출력
        for (int y = 0; y < score.length; y++){    // socre.length = 4이다. 즉 열의 개수이다.
            for (int x = 0; x < score[y].length; x++) {
                System.out.printf("score[%d][%d]=%d%n",y,x,score[y][x]);
            }
        }

        // 2차원 배열의 합
        int total = 0;

        for (int[] tmp : score) {    // 2차원 배열에 저장된 각 요소들(전부 1차원 배열)을 순차적으로 읽어옴
            for (int i :tmp) {      // 위의 for문에서 읽어온 1차원 배열에 저장된 요소들(정수)을 읽어옴
                total += i;
            }
        }
        System.out.println("sum="+total);


        int koTotal = 0, enTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=================================");

        for (int y = 0; y < score.length; y++) {
            int sum = 0;  // 개인별 총점
            float avg = 0.0f;   // 개인별 평균

            koTotal += score[y][0];
            enTotal += score[y][1];
            mathTotal += score[y][2];
            System.out.printf("%3d", y + 1);

            for (int x = 0; x < score[y].length; x++) {
                sum += score[y][x]; // 개인별 총점 계산
                System.out.printf("%5d", score[y][x]);  // 과목별 점수 출력
            }
            avg = sum/(float)score[y].length;   // 개인별 평균
            System.out.printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("=================================");
        System.out.printf("총점: %3d %4d %4d%n", koTotal, enTotal, mathTotal);
    }
}