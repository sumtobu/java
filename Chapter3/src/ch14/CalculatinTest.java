package ch14;

public class CalculatinTest {

	public static void main(String[] args) {
	
		Calc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 0;
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		calc.description();
		
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//인터페이스 정적메소드 호출
		
		
	}

}
