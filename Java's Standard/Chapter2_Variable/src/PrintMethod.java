public class PrintMethod {
    public static void main(String[] args) {
        String str = "Hello World~!";
        System.out.print(str);
        System.out.println(str); // print에 개행문자가 없어서 print와 println이 출력이 한 줄에 붙어서 출력됨

        System.out.print(str+'\n'); // print에서는 따로 개행문자를 추가해줘야한다
        System.out.println(str); // 개행문자를 추가하니 print와 println의 출력이 개행되서 출력됨

        String name = "John Han";
        System.out.printf("I'm %s%n", name);
        // println에서도 String.format()메소드를 통해 문자열 포매팅이 가능하다
        System.out.println(String.format("I'm %s%n", name));

        // 다양한 FormatSpecifiers지시자들도 함께 사용 가능 => but 변수와 지시자 순서 맞추기
        String greet = "Hi";
        int age = 23;

        System.out.printf("%s, I'm %s. %d years old", greet, name ,age);
    }
}
