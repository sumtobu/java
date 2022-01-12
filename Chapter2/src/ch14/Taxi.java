package ch14;

public class Taxi {
	int income;
	String companyName;
	int passengerNumber;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		income += money;
		passengerNumber++;
	}
	
	public void showTaxiInfo() {
		System.out.println(companyName + "택시의 수입은" + income + "입니다.");
	}
	
}
