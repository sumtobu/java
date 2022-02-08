package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student st1 = new Student(100, "Lee");
		Student st2 = new Student(100, "Lee");
		Student st3 = st1;
		
		System.out.println(st1);
		System.out.println(st2);
		         
		System.out.println(st1 == st2); 
		System.out.println(st1.equals(st2));//equals�� ���� ���� �ΰ��� ���ǰ��� ������?
		System.out.println(st1.equals(st3));
		
		System.out.println(st1.hashCode()); //hashCode�� �������̵��� �й��� ��� �ϵ��� ��ȯ
		System.out.println(st2.hashCode());
		
		System.out.println(System.identityHashCode(st1));//���� hashCode ���¹�
		System.out.println(System.identityHashCode(st2));
		
		String str1 = new String("abc"); //String �� ��쿡�� �������� ������ hashCode ���� ���� ���´�
		String str2 = new String("abc"); //int �� ���� hashCode ���� ����� int ��
		
		System.out.println(str1.equals(str2));
		

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		st1.setStudentName("Kim");
		
		Student copyst = (Student)st1.clone();
		System.out.println(copyst);
	
		
		System.out.println(System.identityHashCode(st1)); //Ŭ���ѰͰ� hashCode ��
		System.out.println(System.identityHashCode(copyst));
	}

}
