package ch15.customer;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {//두개의 인터페이스를 implements 하여  default method 가 중복되어 오버라이딩 되어 재정의 필요
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("customer hello");
	}
}
