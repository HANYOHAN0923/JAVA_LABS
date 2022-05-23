package variable;

public class CharEnDecoding {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch); // Encoding

        char ch1 = 66; // Rule: ASCII
        System.out.println(ch1);

        int ch2 = 67;
        System.out.println((char)ch2); // Decoding
    }
}
