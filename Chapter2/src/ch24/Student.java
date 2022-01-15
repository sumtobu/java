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
	//���1	subjectList.add(new Subject(subjectName, subjectScore));
		
		/* ���2
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
		*/
		//���3
		Subject subject = new Subject(subjectName,subjectScore);
		subjectList.add(subject);
		
		
		}
		

	public void showStudentInfo() {
		int total=0;
		/*���1 ���� for ��
		for(int i = 0; i < subjectList.size(); i++) {
			
			total += subjectList.get(i).getSubjectScore();
			System.out.print("�л� "+studentName+"�� "+subjectList.get(i).getSubjectName() +"���� ������ ");
			System.out.println(subjectList.get(i).getSubjectScore() + "�Դϴ�.");
		}
		*/
		//���2 ���� for��
		for(Subject subject : subjectList) {
			total += subject.getSubjectScore();
			System.out.print("�л�"+studentName+"�� "+subject.getSubjectName()+"���� ������ ");
			System.out.println(subject.getSubjectScore()+"�Դϴ�.");
		}
		
		System.out.println("���� : " + total);
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
