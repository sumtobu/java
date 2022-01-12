package ch19;

public class CarFactory {
	static int CarNumber = 10000;
	private static CarFactory instance = new CarFactory(); 

	private CarFactory () {
		
	}
	
	public Car createCar(String carName) {
		CarNumber++;
		Car car = new Car(carName,CarNumber);
		
		car.setCarNumber(CarNumber);
		return car;
	}
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public int getCarNum() {
		return CarNumber;
	}
}
