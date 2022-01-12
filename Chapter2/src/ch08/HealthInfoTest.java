package ch08;

public class HealthInfoTest {

	public static void main(String[] args) {
		HealthInfo Tomas = new HealthInfo("Tomas",37,"³²¼º");
		
		Tomas.weight = 78;
		Tomas.height = 180;
		System.out.println(Tomas.ShowHealthInfo());
	}

}
