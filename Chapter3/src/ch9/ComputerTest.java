package ch9;

public class ComputerTest {

	public static void main(String[] args) {
	//	Computer computer = new Computer(); 추상메서드가 포함된 추상 클래스는 인스턴스화 할 수 없다
		//추상 메서드가 포함되지 않더라도 추상 클래스로 선언한 경우 인스턴스화 할 수 없다
		//추상 클래스는 상속만을 위한 클래스
		Desktop desktop1 = new Desktop();
		Computer desktop2 = new Desktop();
		
		desktop2.turnOn();
		desktop1.display();
 		
	}

}
