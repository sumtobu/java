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
		System.out.println(lineNumber + "라인의 승객수는" + passengerCount + "명 이고, 수입은" + income + "원 입니다.");
	}
}
