package multiDimensional;

import java.util.*;

public class MultiArrEx2 {
    public static void main(String[] args) {
        // 빙고 게임
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];
        Scanner scanner = new Scanner(System.in);

        // 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
        /* 이렇게 빙고배열을 만든 다는 소리임
        1  2  3  4  5
        6  7  8  9  10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25
         */
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                bingo[i][j] = i*SIZE + j + 1;

        // 배열에 저장된 값을 셔플 (utilizeArray Package: Shuffle2 방법을 2차원 배열에 적용)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x = (int)(Math.random()*SIZE);
                y = (int)(Math.random()*SIZE);

                // bingo[i][j]와 임의로 선택한 값(bingo[x][y])을 바꾼다 (셔플 예제와 동일)
                int temp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = temp;
            }
        }

        do {
            // 빙고 2차원 배열 출력
            for (int i = 0; i < SIZE; i++) {
                for(int j = 0; j < SIZE;j++) System.out.printf("%2d",bingo[i][j]);
                System.out.println(); // printf메소드라 개행을 해서 5x5 빙고판 형태로 출력하려고
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)", SIZE*SIZE);
            String temp = scanner.nextLine();
            num = Integer.parseInt(temp);


            // 입력된 수가 빙고 안에 있으면 해당 수의 값을 0으로 변경
            outer:
            for (int i = 0; i < SIZE; i++){
                for (int j = 0; j < SIZE; j++) {
                    if(bingo[i][j] == num) {
                        bingo[i][j] = 0;
                        break outer;
                    }
                }
            }
        } while (num != 0);
    }
}
