package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println(Employee.getSerialNum());
		//인스턴스 생성전에 사용가능
		
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
		
	/*	
		employeeKim.serialNum++;
		System.out.println(employeeLee.serialNum);//두개의 인스턴스가 하나의 스테틱변수 메모리를 공유
		System.out.println(Employee.serialNum);
		System.out.println(employeeKim.serialNum);
		*/
	
		
		//지역변수(로컬변수) : 함수내부 선언 | 함수 내부에서만 사용 | 스택메모리 | 함수가 호출될때 생성 함수 끝나면 소멸
		//멤버 변수(인스턴스 변수) : 클래스 멤버 변수로 선언 | 클래스 내부세서 사용 
		//praivate 이 아니면 참조변수로 다른 클래스에서 사용 가능 | 힙 메모리사용 | 인스턴스가 생성될 때 힙에 생성
		//가비지 컬렉터가 메모리를 수거할 때 소멸
		//static 변수(클래스 변수) : static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 privat 이
		//아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 메모리 | 프로그램이 처음 시작할때 상수와 함께
		//데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 떄 소멸
		
		
		
		// *static 변수는 프로그랭이 메모리에 있는 동안 계속 영역을 차지하므로 너무 큰 메모리를 할당하는것은 좋지 못하다
		//클래스 내부의 여러 메서드에서 사용하는 변수는 멤버변수로 선언하는것이 좋음
		//멤버변수가 너무 많으면 인스턴스 생성 시 쓸대없는 메모리가 할당됨
	}

}
