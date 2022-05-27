package stringClass;

public class ArrayExample3 {
    public static void main(String[] args) {
        String source = "SOSHELP";

        String[] morseCode = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morseCode[source.charAt(i)-'A'];
        }

        System.out.println("source: "+source);
        System.out.println("morse_code: "+result);

    }
}
