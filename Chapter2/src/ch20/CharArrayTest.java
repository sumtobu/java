package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alphabet = new char[26];
		char ch = 'A';
		
		for (int i = 0; i<alphabet.length; i++) {
			alphabet[i] = ch++;
		}
		
		for (int i = 0; i<alphabet.length; i++) {
			System.out.println(alphabet[i] + " : " + (int)alphabet[i]);
		}
		
		for(char alpha : alphabet) {
			System.out.println(alpha + " , " + (int)alpha);
		}
		
	}

}
