package constant;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		
		// byte bNum = iNum; error
		byte bNum = (byte)iNum; //명시적(강제적)으로 byte화 하겠다는 소리
		
		System.out.println(iNum); //iNum 자체의 값이 변한다는 소리가 아니라 바뀌어서 대입되는 값이 변한다는 소리
		System.out.println(bNum); //데이터 유실
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //소숫점 유실, 정수부분만 존재
		
		float fNum = 0.9F;
		
		//method 1
		int num1 = (int)dNum + (int)fNum;
		System.out.println(num1);
		//method 2
		int num1_2 = (int)(dNum+fNum);
		System.out.println(num1_2);
		//method1과 method2의 결과는 다르다! 형변환과 계산의 차례순서 차이로 인한 결과( 선 형변환 후 연산과 선 연산 후 형변환의 차이)
	}

}
