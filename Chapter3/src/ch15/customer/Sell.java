package ch15.customer;
//���̾߸�� problem
public interface Sell {
	void sell();
	default void order() {
		System.out.println("sell order");
	}
}
