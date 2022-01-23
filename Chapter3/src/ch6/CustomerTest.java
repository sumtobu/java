package ch6;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		//3������ ������� Ŭ������ ������ ��� ���� Ŭ������ Customer�� handling �Ѵ�
		Customer customerT = new Customer(001,"Tomas");
		Customer customerJ = new Customer(002,"James");
		Customer customerE = new GoldCustomer(003,"Edward");
		Customer customerP = new GoldCustomer(004,"Percy");
		Customer customerK = new VIPCustomer(005,"Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		//
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 10000;
		for(Customer customer : customerList) {
			int cost;
			cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "����" + cost +"�� ���� �ϼ˽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
