package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	//static은 메모리에 이미 먼저 로드된다
	//인스턴스는 나중에 힙메모리에 만들어진다
	public static int getSerialNum() {//static 메서드 에서는 인스턴스 변수를 사용할 수 없다
		
		int i = 0; //이함수내의 지역 변수는 사용 가능
		
		//employeeName = "Lee";  // 스테틱 메서드가 불려질 때 employeeName이 존재하지 않을 수 있다.
		return serialNum;
	}

	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
