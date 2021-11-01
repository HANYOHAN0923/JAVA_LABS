package binary;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int plusNum = 0B0000000000000000000000000000101; // 5
		int minusNum = 0B11111111111111111111111111111011; // -5
		
		int sumNum = plusNum + minusNum;
		
		System.out.println(plusNum);
		System.out.println(minusNum);
		System.out.println(sumNum);

	}

}
