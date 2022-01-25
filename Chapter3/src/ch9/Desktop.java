package ch9;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOn() {
		System.out.println("Desktop turnON");

	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOFF");

	}

}
