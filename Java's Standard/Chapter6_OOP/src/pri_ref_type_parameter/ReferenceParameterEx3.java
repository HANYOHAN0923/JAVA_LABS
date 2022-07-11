package pri_ref_type_parameter;

public class ReferenceParameterEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }

    static void printArr(int[] x) {
        System.out.print("[");
        for (int y : x) System.out.print(y+",");
        System.out.println("]");
    }

    static void sortArr(int[] x) {
        for (int i = 0; i < x.length -1; i++){
            for (int j = 0; j < x.length -1 -i; j++) {
                if (x[j] > x[j+1]) {
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] =temp;
                }
            }
        }
    }

    static int sumArr(int[] x) {
        int sum = 0;
        for (int y : x) sum += y;
        return sum;
    }
}
