package Chapter4;

public class Q4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100) + 1;
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.println("Please input integer between 1 and 100");
            input = s.nextInt();

            if (input == answer) {
                System.out.printf("맞췄습니다.\n시도횟수는 %d번입니다.",count);
                break;
            } else if (input > answer) System.out.print("더 작은 수를 입력하세요.");
            else System.out.println("더 큰 수를 입력하세요.");
        } while (true);
    }
}
