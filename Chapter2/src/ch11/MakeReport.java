package ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();
	
	private String line = "=========================================\n";
	private String title = " �̸�\t   �ּ� \t  ��ȭ��ȣ\n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {//body ����
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
	}

	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getRepoter() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
