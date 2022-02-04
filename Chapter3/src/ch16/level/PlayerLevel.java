package ch16.level;

public abstract class PlayerLevel {
	protected abstract void run();
	protected abstract void jump();
	protected abstract void turn();
	protected abstract void showLevelMessage();
	protected void go(int jumpNum) {
		showLevelMessage();
		run();
		for (int i=0;i<jumpNum;i++) {
			jump();
		}
		turn();
	}
}
