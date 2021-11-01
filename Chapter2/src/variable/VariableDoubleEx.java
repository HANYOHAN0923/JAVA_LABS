package variable;

public class VariableDoubleEx {

	public static void main(String[] args) {
		double dNum = 3.14; //JAVA에서 실수는 기본적으로 8비트로 저장
		float fNum = 3.14F; //그래서 long int와 같은 원리로, 4비트로 저장하는 것을 컴파일러에게 알려주기위해서 식별자 F를 필요로 한다
		
		System.out.println(dNum);
		System.out.println(fNum);
	}

}
