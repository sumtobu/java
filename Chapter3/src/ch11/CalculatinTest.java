package ch11;

public class CalculatinTest {

	public static void main(String[] args) {
		//Ÿ�� ��� CompleteCalc �� Calc�� Ÿ�Ի�� �޾Ҵ�  CompleteCalc �� Calc Ÿ���̴�
		Calc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 0;
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		
		CompleteCalc calc2 = new CompleteCalc();
		calc2.showInfo();//CompleteCalc ���� ���������� interface Ÿ�Կ����� ��� �Ұ�
	}

}
