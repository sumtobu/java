package ch8;

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
		
		//다운캐스팅 인스턴스의 원래형태가 맞는지 확인하고
		//instanceof 인스턴스의 형이 맞는지 확인한수 true false 반환
		if (customerE instanceof GoldCustomer) {
			GoldCustomer gc = (GoldCustomer)customerE;
			System.out.println(	gc.showCustomerInfo());
		}
		
	}

}
