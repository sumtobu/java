package ch12;

public class Person {
	String name;
	int age;
	
	public Person() {
//		int num = 19;
//		System.out.println();
		this("no name" , -1); //�ٸ� �����ڸ� �θ��� ���� �ٸ� �ڵ� �ۼ� �Ұ�
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
