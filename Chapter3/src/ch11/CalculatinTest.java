package ch11;

public class CalculatinTest {

	public static void main(String[] args) {
		//타입 상속 CompleteCalc 가 Calc를 타입상속 받았다  CompleteCalc 가 Calc 타입이다
		Calc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 0;
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		
		CompleteCalc calc2 = new CompleteCalc();
		calc2.showInfo();//CompleteCalc 에만 존재함으로 interface 타입에서는 사용 불가
	}

}
