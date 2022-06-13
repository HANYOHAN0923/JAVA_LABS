package Chapter4;

public class Q4_12 {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = j+1+(i-1)/3*3;
                int y = i%3 == 0 ? 3 : i%3;

                if (x>9) break; // 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력한다
            }
            System.out.println();
            if (i%3==0) System.out.println();
        }

         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                // y를 먼저 생각하고, y를 기반으로 x를 생각해서 설계하기
                int x = j+1+(i-1)/3*3;  // 단을 의미하는 변수 x
                int y = i%3==0? 3 : i%3;  // 곱하는 숫자를 의미하는 변수 y => 1,2,3이 순차적으로 반복된다

                if (x>9) break;

                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
            if(i%3==0) System.out.println();    // 한칸 띄어쓰기
        }

    }
}
