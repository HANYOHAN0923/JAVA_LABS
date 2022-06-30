package Chapter5;

public class Q5_9 {
    public static void main(String[] args) {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'},
        };

        char[][] result = new char[star[0].length][star.length];

        for (char[] chars : star) {
            for (int j = 0; j < chars.length; j++) System.out.print(chars[j]);
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j <star[i].length; j++) {
                int x = j;
                int y = 3 - i;  // 3 - i = star.length -1 - i
                result[x][y] = star[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) System.out.print(result[i][j]);
            System.out.println();
        }
    }
}
