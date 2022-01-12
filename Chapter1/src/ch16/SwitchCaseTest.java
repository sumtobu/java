package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		int day;
		
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			System.out.println(month +"달은 "+ day + "일 까지");
			break;
		case 2 :
			day = 28;
			System.out.println(month +"달은 "+ day + "일 까지");
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			System.out.println(month +"달은 "+ day + "일 까지");
			break;	
		default:
			day = 0;
			System.out.println(month + "달은 존재하지 않는 달");
		}
		System.out.println(month +"월은 "+ day + "일 까지 있다.");
		//새로 바뀐 switch case 문
		
		month = scanner.nextInt();
		
		int day1  = switch(month) {
		
			case 1,3,5,7,8,10,12->{
				System.out.println("이번달은 31일 까지");
				yield 31;
			}
			case 2->
				28;
			case 4,6,9,11->{
				System.out.println("이번달은 30일 까지");
				yield 30;
			}
			default->{
				System.out.println("존재하지 않는달");
				yield -1;
			}
		};
		
		System.out.println(month + "월은" + day1 +"일 입니다.");
		
		
	}
	
	
}
