package ch15;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int age = scanf.nextInt();
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("�� ���� �Ƶ�");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("�ʵ��л�");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("��, ����л�");
		}
		else {
			charge = 3000;
			System.out.println("����");
		}
		
		System.out.println("������" + charge + "�Դϴ�");
	}

}
