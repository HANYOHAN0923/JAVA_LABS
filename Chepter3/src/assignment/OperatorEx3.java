package assignment;

public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		// i 값이 안 변하는 이유를 주목해야한다.
		// 논리 곲에서 ((num1 = num1 + 10) < 10)가 false이기 때문에 무조건 반환 값은 false이다. 따라서 논리곲의 두번째 항
		//  ((i = i + 2) < 10)은 실행 안 해봐도 false이기 때문에 실행되지 않았다.
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);		// 2
		
		// 여기서도 같은 원리이다.
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);		// 2
		
		
		// 논리 합에서 앞에 항이 false이기 때문에, 뒤의 항 또한 evaluation이 필요해서 i 값이 바뀐것을 볼 수 있다.
		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // 4
	}

}
