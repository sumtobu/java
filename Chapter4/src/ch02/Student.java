package ch02;

public class Student implements Cloneable{// clone �޼��� ����� ���� Cloneable �� implements �������
	
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	public String toString() {
		return studentNum + "," + studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public boolean equals(Object obj){ //equals�� �������̵� �ؼ� �������� ������� true �� ��µǵ��� ����
		if (obj instanceof Student) {
			Student std = (Student)obj;// obj�� Student �� �ٿ�ĳ����
			if (this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode(){ //�й��� ��ȯ�ǵ���
		return studentNum;
	}
	@Override //clone�� �ν��Ͻ��� �����Ѵ�
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
