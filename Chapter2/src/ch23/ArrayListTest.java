package ch23;

import ch21.Book; //ch21���� BookŬ���� ����
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		 
		ArrayList<Book> library = new ArrayList<Book>(); //������ �𸦶� ArrayList�� ���콺�� ���� f1�� ������
		library.add(new Book("�¹���1","������"));//������� ���� ����Ʈ�� 10ĭ�� ��� �ʿ��ϸ� �ø�
		library.add(new Book("�¹���2","������"));
		library.add(new Book("�¹���3","������"));
		library.add(new Book("�¹���4","������"));
		library.add(new Book("�¹���5","������"));
		
		
		for(int i = 0; i<library.size(); i++) {  	//library.size() ���մ� ����� ����
			library.get(i).showInfo();				//get(i)  i ��°���� ������
		}
	}

}
