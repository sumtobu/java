package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		System.out.println(employeeLee.getEmployeeName() + "���� �����" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());
		
		
		employeeKim.serialNum++;
		System.out.println(employeeLee.serialNum);//�ΰ��� �ν��Ͻ��� �ϳ��� ����ƽ���� �޸𸮸� ����
		System.out.println(Employee.serialNum);
		System.out.println(employeeKim.serialNum);
		
	
	}

}
