package variable;

public class ByteVariable {

	public static void main(String[] args) {
		byte bData = -128; //2의 -7승
		System.out.println(bData);
		
		byte bData2 = 127; //128은 초과범위라 오류  발생
		System.out.println(bData2);
	}

}
