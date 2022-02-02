package ch15.customer;
//다이야몬드 problem
public interface Sell {
	void sell();
	default void order() {
		System.out.println("sell order");
	}
}
