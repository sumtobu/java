package ch10;
//���ø� �޼��� : �ڵ��� �帧(�ó�����)�� �����ϴ� �޼��� �����ӿ�ũ���� ���� ���
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() { }
	final public void run() {// final ���� Ŭ�������� ������ �Ұ���
		//�ó�����
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	//final �����
	//final ���� : ���� ����� �� ���� ���
	//final �޼��� : ���� Ŭ�������� ������ �� �� ���� �޼���
	//final Ŭ���� : ����� �� ���� Ŭ����
}
