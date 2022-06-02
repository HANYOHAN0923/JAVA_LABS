package multiDimensional;

import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        // 특정 좌표 값 읽고, 쓰기
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];  // board는 좌표를 입력하기 위한 행번호와 열번호가 필요하다. 그래서 coordinate배열보다 행과 열의 길이가 1 더 크다
        byte[][] coordinate = {
               //1 2 3 4 5 6 7 8 9
                {0,0,0,0,0,0,1,0,0}, // 1
                {1,1,1,1,0,0,1,0,0}, // 2
                {0,0,0,0,0,0,1,0,0}, // 3
                {0,0,0,0,0,0,1,0,0}, // 4
                {0,0,0,0,0,0,0,0,0}, // 5
                {1,1,0,1,0,0,0,0,0}, // 6
                {0,0,0,1,0,0,0,0,0}, // 7
                {0,0,0,1,0,0,0,0,0}, // 8
                {0,0,0,0,0,1,1,1,0}  // 9
            };

        // 1행에 행번호를, 1열에 열번호를 저장한다
        for (int i = 1; i <SIZE; i ++) board[0][i] = board[i][0] = (char)(i+'0'); // board는 char배열이라서, 숫자를 문자로 변환하여 저장해야한다. 그래서 숫자1에 문자'0'을 더하면 문자'1'이 된다. ASCII표 참조


        Scanner scanner = new Scanner(System.in);

        while(true) {
            /*
            * 무한 반복문으로 좌표를 반복해서 입력 받는다.
            * 입력받은 좌표 x,y에 저장된 값이 1이면, board[x][y]에 'O'을, 아니면 'X'를 저장한다.
            * board와 coordinate 길이가 1씩 차이나는 것을 기억해야한다.
            * 그리고 2차원 'char배열'의 각 요소는 1차원 배열이므로 간단하게 출력할 수 있다.
            */
            System.out.println("좌표를 입력하세요. (종료는 00)>");
            String input = scanner.nextLine(); // 유저의 입력을 input에 저장

            if(input.length() == 2) {
                x = input.charAt(0) - '0';  // 문자를 숫자로 변환 ASCII
                y = input.charAt(1) - '0';

                if (x == 0 && y == 0) break; // 00을 입력하면 종료
            }

            if(input.length() != 2 || x <= 0 || x >= SIZE || y >= SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");    //잘못된 입력처리
                continue;
            }

            // coordinate[x-1][y-1]의 값이 1이면, '0'을 board[x][y]에 저장한다
            // board index 0~9, length = 10
            // coordinate 0~8, length = 9
            // 그냥 찾고 싶은데로 coordinate의 주석 번호보고 그대로 하면되는데, 좌표로볼때 [x] 값은  y축, [y] 값은 x축이라고 생각하자
            board[x][y] = coordinate[x-1][y-1] == 1 ? 'O' : 'X';

            // 배열 board의 내용을 화면에 출력한다
            for (int i = 0; i <SIZE; i++) System.out.println(board[i]);     // board[i]는 1차원 배열
            System.out.println();
        }
    }
}
