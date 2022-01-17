package ch4;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(100010,"이순신");
	
		customerLee.bonusPoint = 1000;
		
		int price = customerLee.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100020,"김유신");
		
		customerKim.bonusPoint = 10000;
		
		price = customerKim.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		//자료 타입과 대입된 인스턴스 타입이 같은 이름의 메서드를 오버라이딩 한경우
		//형 변환
		Customer vc = new VIPCustomer(12345, "TestID"); 
		//자바에서는 항상 인스턴스의 메서드가 호출됨 : 가상 메서드virtual method
		System.out.println(vc.calcPrice(1000));
	}

}
