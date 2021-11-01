package variable;

public class VariableCharEx {

	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65 Unicode 숫자 값으로 표현
		
		ch = 66;
		
		System.out.println(ch); // B 문자열은 내부적으로 정수로 표현이 된다
	}

}
