package ch15.customer;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
	
	
}
