package ch12;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.showPerson();
		
		System.out.println(person.getPerson());
		
		Person person2 = person.getPerson();
		
		System.out.println(person2.getPerson());
		
		person2.showPerson();
		
		person.age = 13;
		
		person2.showPerson();
	}

}