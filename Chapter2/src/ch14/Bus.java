package ch14;

public class Bus {
	int busNumber;
	int passengerCount;
	int income;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.income = this.income + money;
		passengerCount++;
	}
	public void showBusInfo() {
		System.out.println(busNumber + "���� �°�����" + passengerCount + "�� �̰�, ������" + income + "�� �Դϴ�.");
		
	}
}
