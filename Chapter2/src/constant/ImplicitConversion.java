package constant;

public class ImplicitConversion {

	public static void main(String[] args) {
		//�� ū ���� ����ȯ
		byte bNum = 10;
		int  num = bNum;
		
		System.out.println(num);
		
		//�� ������ ���� ����ȯ 8���� 4����Ʈ���� �Ǽ��� �� ������ �������� ����
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //float + int �� num�� float���� ����ȯ�̵�. �� ���� dNum���� float������ ����� ��, �ٽ� �̰��� double�� ����ȯ�� �̷����
		System.out.println(dNum);
	}

}
