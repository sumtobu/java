package ch4;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(100010,"�̼���");
	
		customerLee.bonusPoint = 1000;
		
		int price = customerLee.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(100020,"������");
		
		customerKim.bonusPoint = 10000;
		
		price = customerKim.calcPrice(1000);
		System.out.println(price);
		System.out.println(customerKim.showCustomerInfo());
		
		
		
		//�ڷ� Ÿ�԰� ���Ե� �ν��Ͻ� Ÿ���� ���� �̸��� �޼��带 �������̵� �Ѱ��
		//�� ��ȯ
		Customer vc = new VIPCustomer(12345, "TestID"); 
		//�ڹٿ����� �׻� �ν��Ͻ��� �޼��尡 ȣ��� : ���� �޼���virtual method
		System.out.println(vc.calcPrice(1000));
	}

}
