package ch10;

public class BirthDay {
	
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //default = false
	
	public int getDay(){
		return day;
	}
	
	public void setDay(int day) {
		
		
		
		
		int dayMax = switch (month) {
			case 1,3,5,7,8,10,12->{
				yield 31;
			}
			case 2->{
				if((year%4) == 0){
					
					if((year%100) == 0) {
						
						if((year%400) == 0) {
							yield 29;
						}
						yield 28;
					}
					yield 29;
				}
				
				yield 28;
				}
			case 4,6,9,11->{
				yield 30;
			}
			default->{
				isValid = false;
				yield -1;
			}
		};
		
		if (day < 1 || day > dayMax) {
			isValid = false;
		}
		else {
			this.day = day;
			isValid = true;
		}
		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		
		if (month < 1 || month >12) {
			isValid = false;
			
		}
		
		else {
			isValid = true;
			this.month = month;
		}
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
	
	public boolean getIsValid() {//read only
		return isValid;
	}
	
}
