package ch4;

public class VIPCustomer extends Customer {
	
	
	

	double salesRatio;
	private String agentId;
	

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	//오버라이딩 에노테이션
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusPoint;
		price  -= (int)(price * salesRatio);
		return price;
	}


	public String getAgentId() {
		return agentId;
	}
}
