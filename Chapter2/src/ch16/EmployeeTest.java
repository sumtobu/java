package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
		
		
		employeeKim.serialNum++;
		System.out.println(employeeLee.serialNum);//두개의 인스턴스가 하나의 스테틱변수 메모리를 공유
		System.out.println(Employee.serialNum);
		System.out.println(employeeKim.serialNum);
		
	
	}

}
