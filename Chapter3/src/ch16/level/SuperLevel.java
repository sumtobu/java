package ch16.level;

public class SuperLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	protected void jump() {
		System.out.println("���� jump �մϴ�.");
	}

	@Override
	protected void turn() {
		System.out.println("turn �մϴ�.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** ����� �����Դϴ�. ******");
	}

}
