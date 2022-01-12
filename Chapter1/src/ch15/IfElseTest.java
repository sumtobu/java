package ch15;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int age = scanf.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("미 취학 아동");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("초등학생");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("중, 고등학생");
		}
		else {
			charge = 3000;
			System.out.println("성인");
		}
		
		System.out.println("입장료는" + charge + "입니다");
	}

}
