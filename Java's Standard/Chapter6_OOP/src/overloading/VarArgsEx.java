package overloading;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};


        System.out.println(concatenate("","100","200","300"));
        // 가변인수 자체가 배열이라 가변인수자리에 배열을 줘도 정상적으로 실행된다
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",", new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delimiter, String... args) {
     String result = "";

     for(String str : args) result += str + delimiter;

     return result;
    }
    /*
    static String concatenate(String... args) {return concatenate("", args);}
     */
}
