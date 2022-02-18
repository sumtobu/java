package ch03;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("abc"); //new 하게 되면 힙 메모리에 인스턴스로 생성됨
		String str2 = new String("abc"); //두개의 인스턴스가 생김으로 
		
		System.out.println(str1 == str2); //두개의 인스턴스는 다름
		
		String str3 = "abc";//상수 풀(Constant pool) 에 있는 주소를 참조
		String str4 = "abc";// 모두 같은 주소 값을 가짐
	
		System.out.println(str3 == str4); 
		
		// String 은 final 한번 선언되면 불변immutable 이기 때문에 String 을 연결하면 새로운 문자열 생성 메모리 낭비
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));//다른 주소를 가리키게 됨
		
		//메모리가 낭비되기 때문에 StringBuilder, StringBuffer 사용 final로 선언 안되어있음으로 변경 가능
		//StringBuffer 는 멀티 스레드 상황에서 동기화 제공
		//단일 쓰레드 StringBuilder사용
		
		
		
	}

}
