package multiDimensional;

public class VariableArray {
    public static void main(String[] args) {
        // 가변 배열
        int[][]  table1 = new int[5][3]; // 5행 3열의 2차원 배열 생성

        // 아래와 같이 할 수도 있음
        int[][] table2 = new int[5][]; // 두번째 차원의 길이는 지정하지 않는다. 즉 행만 지정하고, 열의 개수는 지정 안 함
        for (int i = 0; i < table2.length; i++) table2[i] = new int[3];

        // table3처럼 각 행마다 다른 길이의 2차원 배열을 만들 수 있다
        int[][] table3 = new int[5][];
        table3[0] = new int[4];
        table3[1] = new int[3];
        table3[2] = new int[2];
        table3[3] = new int[2];
        table3[4] = new int[3];

        System.out.println(table3.length);  // 5
        System.out.println(table3[0].length);   // 4
        System.out.println(table3[3].length);   // 2
    }
}
