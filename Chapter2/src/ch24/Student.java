package ch24;

import java.util.ArrayList;

public class Student {
	
	ArrayList<Subject> subjectList;
	
	private int studentNumber;
	private String studentName;
	
	public Student(int studentNumber, String studentName) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
	
		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String subjectName, int subjectScore) {
		subjectList.add(new Subject(subjectName, subjectScore));
	}

	public void showStudentInfo() {
		for(int i = 0; i < subjectList.size(); i++) {
			System.out.print("�л� "+studentName+"�� "+subjectList.get(i).getSubjectName() +"���� ������ ");
			System.out.println(subjectList.get(i).getSubjectScore() + "�Դϴ�.");
		}
		System.out.println("=====================================================");
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
