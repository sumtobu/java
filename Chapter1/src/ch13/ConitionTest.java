package ch13;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		int max;
		System.out.println("두 수를 입력 받아서 더 큰수 출력하기");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력1:");
		int num1 = scanner.nextInt();
		System.out.print("입력2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2;
		System.out.println(max);
	}

}
