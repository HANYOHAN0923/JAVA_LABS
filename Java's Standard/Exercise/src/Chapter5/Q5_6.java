package Chapter5;

public class Q5_6 {
    public static void main(String[] args) {
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("Money="+money);

        for(int i = 0; i < coinUnit.length; i++) {
            System.out.printf("%d원: %d\n",coinUnit[i],money/coinUnit[i]);
            money %= coinUnit[i];
        }
    }
}
