package ch16;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	//static�� �޸𸮿� �̹� ���� �ε�ȴ�
	//�ν��Ͻ��� ���߿� ���޸𸮿� ���������
	public static int getSerialNum() {//static �޼��� ������ �ν��Ͻ� ������ ����� �� ����
		
		int i = 0; //���Լ����� ���� ������ ��� ����
		
		//employeeName = "Lee";  // ����ƽ �޼��尡 �ҷ��� �� employeeName�� �������� ���� �� �ִ�.
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
