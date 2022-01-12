package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		
		int dan = 2;
		int count = 1;
		
		for(; dan<10 ; dan++) {
			System.out.println(dan + "´Ü");
			for(count = 1 ; count<10 ; count++) {
				System.out.println(dan + "x" + count + "=" + dan*count);
			}
			
			System.out.println();
		}
		dan = 2;
		count=1;
		while(dan<=9) {
			
			count=1;
			System.out.println(dan + "´Ü");
			while(count<=9) {
			
				System.out.println(dan + "x" + count + "=" + dan*count);
				count++;
			}
			System.out.println();
			dan++;
		}
	}

}
