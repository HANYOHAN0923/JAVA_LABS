package utilizeArray;

public class Frequency {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int [10];

        for (int i = 0; i < numArr.length; i++) System.out.print(numArr[i] = (int)(Math.random()*10));
        System.out.println();

        // 핵심코드
        for (int i = 0; i <numArr.length; i++) counter[numArr[i]]++;

        for(int i = 0; i < numArr.length; i++) System.out.printf("%d의 개수: %d%n", i, counter[i]);
    }
}
