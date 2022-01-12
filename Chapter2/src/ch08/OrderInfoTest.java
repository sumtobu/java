package ch08;

public class OrderInfoTest {

	public static void main(String[] args) {
		OrderInfo order001 = new OrderInfo("20220109","203045");
		
		order001.orderPrice = 13500;
		order001.orderAddress = "서울 강남구";
		order001.menuNumber = 12;
		order001.phoneNumber = "01065409702";
		
		System.out.println(order001.ShowOrderInfo());
		
	}

}
