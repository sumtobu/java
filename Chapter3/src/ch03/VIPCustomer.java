package ch03;

public class VIPCustomer extends Customer {
	
	
	

	double salesRatio;
	private String agentId;
	
	/*
	public VIPCustomer() {
		//super(); ���� Ŭ������ ������  �Ⱦ��� �ڵ����� �� constructer
		//super(0,null);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
		
	}*/
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() call");
	}
	public String getAgentId() {
		return agentId;
	}
}
