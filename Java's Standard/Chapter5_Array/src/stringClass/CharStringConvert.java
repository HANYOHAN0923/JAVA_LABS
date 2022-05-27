package stringClass;

public class CharStringConvert {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.printf("src.charAt(%d): %s%n", i, ch);
        }

        // String str을 char[]로 변환
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}
