package ch9;

public class ComputerTest {

	public static void main(String[] args) {
	//	Computer computer = new Computer(); �߻�޼��尡 ���Ե� �߻� Ŭ������ �ν��Ͻ�ȭ �� �� ����
		//�߻� �޼��尡 ���Ե��� �ʴ��� �߻� Ŭ������ ������ ��� �ν��Ͻ�ȭ �� �� ����
		//�߻� Ŭ������ ��Ӹ��� ���� Ŭ����
		Desktop desktop1 = new Desktop();
		Computer desktop2 = new Desktop();
		
		desktop2.turnOn();
		desktop1.display();
 		
	}

}
