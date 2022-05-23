package condition;

public class SwitchExample {
    public static void main(String[] args) {
        int rank = (int)(Math.random()*5)+1;
        String medal;

    /*
    Switch-Case문은 if문과 동일한 역할을 수행한다고 할 수 있다.
    다만 여러가지 경우에서 가독성을 올릴 수 있는 조건 제어문이다.

    Switch는 모든 case마다 break를 작성해줘야하며, 여러개의 case를 동시에 사용할 수 있다
    Ex) case 1: case2: case3:
     */
        switch (rank) {
            case 1:
                medal = "Gold Medal";
                System.out.println(String.format("Result: Rank%d - %s", rank, medal));
                break;
            case 2:
                medal = "Silver Medal";
                System.out.println(String.format("Result: Rank%d - %s", rank, medal));
                break;
            case 3:
                medal = "Bronze Medal";
                System.out.println(String.format("Result: Rank%d - %s", rank, medal));
                break;
            default: System.out.println(rank);
                break;

        }
    }
}
