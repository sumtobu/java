package ch10;

public class MenualCar  extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� �극��ũ�� ��� �����մϴ�.");
		
	}

	@Override
	public void wiper() {
		System.out.println("����� �����۸� �մϴ�.");
		
	}

}
