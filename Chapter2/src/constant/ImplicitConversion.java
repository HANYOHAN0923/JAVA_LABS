package constant;

public class ImplicitConversion {

	public static void main(String[] args) {
		//더 큰 수로 형변환
		byte bNum = 10;
		int  num = bNum;
		
		System.out.println(num);
		
		//더 정밀한 수로 형변환 8에서 4바이트지만 실수가 더 정밀한 수임으로 가능
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //float + int 즉 num이 float으로 형변환이됨. 이 값이 dNum으로 float값으로 저장된 후, 다시 이것이 double로 형변환이 이루어짐
		System.out.println(dNum);
	}

}
