package ch12;

public class Person {
	String name;
	int age;
	
	public Person() {
//		int num = 19;
//		System.out.println();
		this("no name" , -1); //다른 생성자를 부르기 전에 다른 코드 작성 불가
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	public Person getPerson() {
		return this;
	}
}
