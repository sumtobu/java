package ch15.customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; //��ĳ���� Ÿ���� �����ϰ��հ� ����Ŭ������ Ÿ������ ���������� ����ȯ
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}

}
