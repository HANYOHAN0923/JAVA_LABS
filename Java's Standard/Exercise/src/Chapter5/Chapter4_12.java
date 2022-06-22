package Chapter5;

public class Chapter4_12 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 4; j ++) {
                int x = j+1 + (i-1)/3*3;   // 단 수: 2,3,4 - 4,5,6 - 7,8이 3번씩 반복
                int y = (i%3 == 0) ? 3: i%3;   // 곱해지는 수: 1,1,1 - 2,2,2 - 3,3,3 차례대로 나오기 위해서 => 핵심 j가 3번 반복되는 동안 i의 값은 같다

                if (x > 9) break;

                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
            if (i%3 == 0) System.out.println();
        }
    }
}
