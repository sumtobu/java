package ch14;

public class Subway {
	int lineNumber;
	int passengerCount;
	int income;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.income += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(lineNumber + "������ �°�����" + passengerCount + "�� �̰�, ������" + income + "�� �Դϴ�.");
	}
}
