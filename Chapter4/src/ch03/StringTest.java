package ch03;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc"); //new �ϰ� �Ǹ� �� �޸𸮿� �ν��Ͻ��� ������
		String str2 = new String("abc"); //�ΰ��� �ν��Ͻ��� �������� 
		
		System.out.println(str1 == str2); //�ΰ��� �ν��Ͻ��� �ٸ�
		
		String str3 = "abc";//��� Ǯ(Constant pool) �� �ִ� �ּҸ� ����
		String str4 = "abc";// ��� ���� �ּ� ���� ����
	
		System.out.println(str3 == str4); 
		
		// String �� final �ѹ� ����Ǹ� �Һ�immutable �̱� ������ String �� �����ϸ� ���ο� ���ڿ� ���� �޸� ����
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));//�ٸ� �ּҸ� ����Ű�� ��
		
		//�޸𸮰� ����Ǳ� ������ StringBuilder, StringBuffer ��� final�� ���� �ȵǾ��������� ���� ����
		//StringBuffer �� ��Ƽ ������ ��Ȳ���� ����ȭ ����
		//���� ������ StringBuilder���
		
		
		
	}

}
