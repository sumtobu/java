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
		System.out.println(busNumber + "번의 승객수는" + passengerCount + "명 이고, 수입은" + income + "원 입니다.");
		
	}
}
