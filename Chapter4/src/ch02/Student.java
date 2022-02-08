package ch02;

public class Student implements Cloneable{// clone 메서드 사용을 위해 Cloneable 를 implements 해줘야함
	
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
	public boolean equals(Object obj){ //equals를 오버라이딩 해서 논리적으로 같을경우 true 로 출력되도록 수정
		if (obj instanceof Student) {
			Student std = (Student)obj;// obj를 Student 로 다운캐스팅
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
	public int hashCode(){ //학번이 반환되도록
		return studentNum;
	}
	@Override //clone은 인스턴스를 복제한다
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
