package ch16.level;

public class BeginnerLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	protected void jump() {
		System.out.println("jump ��������");
	}

	@Override
	protected void turn() {
		System.out.println("turn ��������");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** �ʱ��� �����Դϴ�. ******");
	}

}
