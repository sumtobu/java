package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		System.out.println(Employee.getSerialNum());
		//�ν��Ͻ� �������� ��밡��
		
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		System.out.println(Employee.getSerialNum());
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		System.out.println(employeeLee.getEmployeeName() + "���� �����" + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());
		
	/*	
		employeeKim.serialNum++;
		System.out.println(employeeLee.serialNum);//�ΰ��� �ν��Ͻ��� �ϳ��� ����ƽ���� �޸𸮸� ����
		System.out.println(Employee.serialNum);
		System.out.println(employeeKim.serialNum);
		*/
	
		
		//��������(���ú���) : �Լ����� ���� | �Լ� ���ο����� ��� | ���ø޸� | �Լ��� ȣ��ɶ� ���� �Լ� ������ �Ҹ�
		//��� ����(�ν��Ͻ� ����) : Ŭ���� ��� ������ ���� | Ŭ���� ���μ��� ��� 
		//praivate �� �ƴϸ� ���������� �ٸ� Ŭ�������� ��� ���� | �� �޸𸮻�� | �ν��Ͻ��� ������ �� ���� ����
		//������ �÷��Ͱ� �޸𸮸� ������ �� �Ҹ�
		//static ����(Ŭ���� ����) : static ���� ����Ͽ� Ŭ���� ���ο� ���� | Ŭ���� ���ο��� ����ϰ� privat ��
		//�ƴϸ� Ŭ���� �̸����� �ٸ� Ŭ�������� ��� ���� | ������ ���� �޸� | ���α׷��� ó�� �����Ҷ� ����� �Բ�
		//������ ������ �����ǰ� ���α׷��� ������ �޸𸮸� ������ �� �Ҹ�
		
		
		
		// *static ������ ���α׷��� �޸𸮿� �ִ� ���� ��� ������ �����ϹǷ� �ʹ� ū �޸𸮸� �Ҵ��ϴ°��� ���� ���ϴ�
		//Ŭ���� ������ ���� �޼��忡�� ����ϴ� ������ ��������� �����ϴ°��� ����
		//��������� �ʹ� ������ �ν��Ͻ� ���� �� ������� �޸𸮰� �Ҵ��
	}

}
