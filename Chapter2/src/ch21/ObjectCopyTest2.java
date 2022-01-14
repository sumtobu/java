package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];	
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1","조정래");
		library[1] = new Book("태백산맥1","조정래");
		library[2] = new Book("태백산맥1","조정래");
		library[3] = new Book("태백산맥1","조정래");
		library[4] = new Book("태백산맥1","조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		//깊은복사
		for(int i = 0 ; i<copyLibrary.length ; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
	
		System.out.println("library");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("copyLibrary"); //주소가 다르다
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("박원서");
		library[0].setTitle("나목");
		
		
		System.out.println("library");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("copyLibrary"); //서로 영향을 주지 않는다
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		

	}

}
