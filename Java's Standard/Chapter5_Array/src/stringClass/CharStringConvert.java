package stringClass;

public class CharStringConvert {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.printf("src.charAt(%d): %s%n", i, ch);
        }

        // String str์ char[]๋ก ๋ณํ
        char[] chArr = src.toCharArray();
        System.out.println(chArr);
    }
}
