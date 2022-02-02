package ch14;

public abstract class Calculator implements Calc{//인터페이스 구현하기 여기서는 일부만 구현

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
}
