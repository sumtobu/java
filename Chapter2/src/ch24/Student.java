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
	//방법1	subjectList.add(new Subject(subjectName, subjectScore));
		
		/* 방법2
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		
		subjectList.add(subject);
		*/
		//방법3
		Subject subject = new Subject(subjectName,subjectScore);
		subjectList.add(subject);
		
		
		}
		

	public void showStudentInfo() {
		int total=0;
		/*방법1 기존 for 문
		for(int i = 0; i < subjectList.size(); i++) {
			
			total += subjectList.get(i).getSubjectScore();
			System.out.print("학생 "+studentName+"의 "+subjectList.get(i).getSubjectName() +"과목 성적은 ");
			System.out.println(subjectList.get(i).getSubjectScore() + "입니다.");
		}
		*/
		//방법2 향상된 for문
		for(Subject subject : subjectList) {
			total += subject.getSubjectScore();
			System.out.print("학생"+studentName+"의 "+subject.getSubjectName()+"과목 성적은 ");
			System.out.println(subject.getSubjectScore()+"입니다.");
		}
		
		System.out.println("총점 : " + total);
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
