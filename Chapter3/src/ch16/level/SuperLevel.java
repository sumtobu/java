package ch16.level;

public class SuperLevel extends PlayerLevel{

	@Override
	protected void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	protected void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	protected void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	protected void showLevelMessage() {
		System.out.println("****** 고급자 레벨입니다. ******");
	}

}
