package variable;

public class VariableIntLongEx {

	public static void main(String[] args) {
		
		int num = 10; //기본적으로 JAVA에서의 정수는 4바이트 저장시킨다
		
		long numBig = 12345678900L; //그래서 이 숫자는 8바이트짜리로 저장을 시켜야한다. 그래서 컴파일러가 수를 8비트로 저장하기 위해서는 식별자 L을 필요로 한다. 왜냐하면 4비트는 저 숫자를 담을 수 없음
		
		System.out.println(num);
		System.out.println(numBig);
	}

}
