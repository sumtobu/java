package ch10;
//템플릿 메서드 : 코드의 흐름(시나리오)를 정의하는 메서드 프레임워크에서 많이 사용
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() { }
	final public void run() {// final 하위 클래스에서 재정의 불가능
		//시나리오
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	//final 예약어
	//final 변수 : 값이 변경될 수 없는 상수
	//final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
	//final 클래스 : 상속할 수 없는 클래스
}
