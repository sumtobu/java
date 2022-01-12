package ch19;

public class ForTest {

	public static void main(String[] args) {
		int sum=0;
		
		for(int count=1, i = 0; i<10 ; i++, count++) {
			sum += count;
		}
		System.out.println(sum);
	}

}
