package variable;

public class VariableCharEx {

	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch); // A
		System.out.println((int)ch); // 65 Unicode ���� ������ ǥ��
		
		ch = 66;
		
		System.out.println(ch); // B ���ڿ��� ���������� ������ ǥ���� �ȴ�
	}

}
