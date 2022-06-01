package utilizeArray;

import java.util.Arrays;

public class RandomFill {
    public static void main(String[] args) {
        int[] ref = {1, 3, 5, 7, 9};
        int[] arr = new int[ref.length*2];

        for (int i = 0; i < arr.length; i++ ) {
            int temp = (int)(Math.random()*ref.length);
            arr[i] = ref[temp];
        }
        System.out.println(Arrays.toString(arr));
    }
}
