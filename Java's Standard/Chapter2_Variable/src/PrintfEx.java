public class PrintfEx {
    public static void main(String[] args) {
        String str = "World~!";

        // General Method - println()
        System.out.println(String.format("Hello %s", str));

        // printf() => string format with specifiers
        // 자바의 정석 36pg
        System.out.printf("Hello %s", str);

    }
}
