package variable;

public class Variable {

	public static void main(String[] args) {
		
		//method1
		int num;
		num = 10;
		
		//method2
		int anotherNum = 10;
		
		System.out.println(num);
		System.out.println(anotherNum);
		
		num = 'a';
		System.out.println(num); // 이미 a는 int로 선언이 되었기 때문에 unicode 숫자 값으로 대체되서 출력
	}

}
