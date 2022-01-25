package binary;

public class VariableEx2 {

	public static void main(String[] args) {
		
		long num = 12345678900L; // 식별자 L을 사용해서, 해당 숫자를 저장할 때 8byte로 저장하라는 것이다. 자바는 기본적으로 수를 4byte로 저장하기 때문에 다음과 같은 식별자를 필요로 한다.
		
		System.out.println(num);
	}

}
