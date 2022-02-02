package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default	void description() {
		System.out.println("정수의 사칙연산 제공");
		myMethod();
	}
	
	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	private void myMethod() {//private method는 재정의 불가
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticmethod");
	}
}
