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
		return "�ֹ���ȣ" + orderNumber + "�� ������ " + orderPrice + "�Դϴ�.";
	}
}
