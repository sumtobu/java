package ch21;


public class ObjectCopyTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];	
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���1","������");
		library[2] = new Book("�¹���1","������");
		library[3] = new Book("�¹���1","������");
		library[4] = new Book("�¹���1","������");
		
		System.arraycopy(library, 0, copyLibrary, 0, library.length);
		//���� ����
		System.out.println("library");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("copyLibrary"); //�ּҵ� �Ȱ���
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("�ڿ���");
		library[0].setTitle("����");
		
		
		System.out.println("library");
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("copyLibrary"); //���� �ϳ��� �ٲٸ� ������ �ش�
		for (Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		

	}

}
