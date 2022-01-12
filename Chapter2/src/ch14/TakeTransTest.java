package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student James = new Student("James",5000);
		Student Tomas = new Student("Tomas",10000);
		Student Edward = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway subwaygreen = new Subway(2);
		Subway subwayblack = new Subway(1);
		
		Taxi gallnagaTaxi = new Taxi("잘나간다 운수");
		
		James.takeBus(bus100);
		Tomas.takeSubway(subwaygreen);
		Edward.takeTaxi(gallnagaTaxi);
		
		James.showInfo();
		Tomas.showInfo();
		Edward.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayblack.showBusInfo();
		subwaygreen.showBusInfo();
		gallnagaTaxi.showTaxiInfo();
	}

}
