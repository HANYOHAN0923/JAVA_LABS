package commandLine;

public class CommandEx1 {
    public static void main(String[] args) {
        /*
        만일 입력된 변수가 없을 경우, 참조변수 args의 값은 null이 된다. 즉 배열 args를 사용하는 모든 코드에서 오류가
        발생된다. 따라서 이러한 오류를 피하기 위해서, if문을() 추가해야 오류가 안 난다. 그렇지만 JVM이 자동적이로 null인
        경우에 크기가 0인 배열을 생성해서, args에 전달하기 때문에 if문을 생략해도 오류가 발생하지 않는다
        */
        if (args != null) {
            System.out.println("매개변수의 개수: " + args.length);

            for (int i = 0; i < args.length; i++) System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
