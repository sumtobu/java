package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar("2020년 소나타");
		Car yourSonata = factory.createCar("2022년 소나타");
		
		System.out.println("차종 : " + mySonata.getCarName() + " 차량번호 : " + mySonata.getCarNumber());
		System.out.println("차종 : " + yourSonata.getCarName() + " 차량번호 : " + yourSonata.getCarNumber());
	}

}
