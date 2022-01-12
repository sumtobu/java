package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar("2020�� �ҳ�Ÿ");
		Car yourSonata = factory.createCar("2022�� �ҳ�Ÿ");
		
		System.out.println("���� : " + mySonata.getCarName() + " ������ȣ : " + mySonata.getCarNumber());
		System.out.println("���� : " + yourSonata.getCarName() + " ������ȣ : " + yourSonata.getCarNumber());
	}

}
