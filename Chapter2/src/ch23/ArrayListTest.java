package ch23;

import ch21.Book; //ch21에서 Book클래스 참조
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		 
		ArrayList<Book> library = new ArrayList<Book>(); //사용법을 모를때 ArrayList에 마우스를 놓고 f1을 누른다
		library.add(new Book("태백산맥1","조정래"));//순서대로 넣음 디폴트로 10칸을 잡고 필요하면 늘림
		library.add(new Book("태백산맥2","조정래"));
		library.add(new Book("태백산맥3","조정래"));
		library.add(new Book("태백산맥4","조정래"));
		library.add(new Book("태백산맥5","조정래"));
		
		
		for(int i = 0; i<library.size(); i++) {  	//library.size() 들어가잇는 요소의 개수
			library.get(i).showInfo();				//get(i)  i 번째것을 꺼내옴
		}
	}

}
