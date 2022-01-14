package ch21;

import java.util.Scanner;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for (Book book : library) {
			System.out.println(book);
		}
		
		Scanner scanner = new Scanner(System.in);
		String a,b;
		for (int i = 0; i < library.length; i++) {
			a = scanner.next();
			b = scanner.next();
			library[i] = new Book(a,b);
		}
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		
		
 	}


}
