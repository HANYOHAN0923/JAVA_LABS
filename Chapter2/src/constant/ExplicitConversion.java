package constant;

public class ExplicitConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		
		// byte bNum = iNum; error
		byte bNum = (byte)iNum; //�����(������)���� byteȭ �ϰڴٴ� �Ҹ�
		
		System.out.println(iNum); //iNum ��ü�� ���� ���Ѵٴ� �Ҹ��� �ƴ϶� �ٲ� ���ԵǴ� ���� ���Ѵٴ� �Ҹ�
		System.out.println(bNum); //������ ����
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum); //�Ҽ��� ����, �����κи� ����
		
		float fNum = 0.9F;
		
		//method 1
		int num1 = (int)dNum + (int)fNum;
		System.out.println(num1);
		//method 2
		int num1_2 = (int)(dNum+fNum);
		System.out.println(num1_2);
		//method1�� method2�� ����� �ٸ���! ����ȯ�� ����� ���ʼ��� ���̷� ���� ���( �� ����ȯ �� ����� �� ���� �� ����ȯ�� ����)
	}

}
