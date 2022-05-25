package utilizeArray;

public class Shuffle2 {
    public static void main(String[] args) {

        // 1~45의 번호가 적힌 카드를 무작위로 섞고, 6장을 임의로 고르는 프로그램
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int temp = 0;   // 두 값을 바꾸는데 사용할 변수
        int n = 0;  // 임의의 값을 얻어서 저장할 변수

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는디
        // 0번재 부터 5번째 요소까지 모두 6개만 바꾼다.
        for (int i = 0; i < 6; i++) {
            n = (int)(Math.random()*45);
            temp = ball[i];
            ball[i] = ball[n];
            ball[n] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
        }

        /*
        shuffle1.java: 0번째 인덱스와 n번째 인덱스를 반복횟수만큼 교환
        shuffle2.java: for문 i의 증감식에 따라 i번째 인덱스와 n번째 인덱스를 반복횟수만큼 교환

        결론: shuffle2.java가 더 짧은 반복 주기 안에서, 더 많이 섞인다.
         */
    }
}
