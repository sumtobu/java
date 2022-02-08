package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Student st1 = new Student(100, "Lee");
		Student st2 = new Student(100, "Lee");
		Student st3 = st1;
		
		System.out.println(st1);
		System.out.println(st2);
		         
		System.out.println(st1 == st2); 
		System.out.println(st1.equals(st2));//equals의 원래 정의 두개의 정의값이 같은가?
		System.out.println(st1.equals(st3));
		
		System.out.println(st1.hashCode()); //hashCode를 오버라이딩해 학번을 출력 하도록 변환
		System.out.println(st2.hashCode());
		
		System.out.println(System.identityHashCode(st1));//원래 hashCode 보는법
		System.out.println(System.identityHashCode(st2));
		
		String str1 = new String("abc"); //String 의 경우에는 논리적으로 같으면 hashCode 값이 같게 나온다
		String str2 = new String("abc"); //int 의 경우는 hashCode 값이 저장된 int 값
		
		System.out.println(str1.equals(str2));
		

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		st1.setStudentName("Kim");
		
		Student copyst = (Student)st1.clone();
		System.out.println(copyst);
	
		
		System.out.println(System.identityHashCode(st1)); //클론한것과 hashCode 비교
		System.out.println(System.identityHashCode(copyst));
	}

}
