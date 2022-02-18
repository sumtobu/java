package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();//getClass 를 사용하려면 이미 인스턴스가 있는 상태여야함
		Person p = (Person)c2.newInstance(); //default Constructor 가 불림
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		
		
	}

}
