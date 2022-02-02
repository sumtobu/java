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
	public void order() {//�ΰ��� �������̽��� implements �Ͽ�  default method �� �ߺ��Ǿ� �������̵� �Ǿ� ������ �ʿ�
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("customer hello");
	}
}
