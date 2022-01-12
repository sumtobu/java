package ch08;

public class OrderInfo {
	public String orderNumber;
	public String phoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public int orderPrice;
	public int menuNumber;
	
	public OrderInfo(String orderDate,String orderTime){
		this.orderDate = orderDate;
		this.orderTime = orderTime;

		orderNumber = orderDate + orderTime;
	}
	
	public String ShowOrderInfo() {
		return "주문번호" + orderNumber + "의 가격은 " + orderPrice + "입니다.";
	}
}
