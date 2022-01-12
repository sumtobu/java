package ch19;

public class Car {
	public String carName;
	public int carNumber;
	
	public Car(String carName, int carNumber) {
		this.carName = carName;
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
	
}
