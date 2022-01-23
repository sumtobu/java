package ch6;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		//3종류의 고객등급의 클래스가 있지만 모두 상위 클래스인 Customer로 handling 한다
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
			System.out.println(customer.getCustomerName() + "님이" + cost +"원 지불 하셧습니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
