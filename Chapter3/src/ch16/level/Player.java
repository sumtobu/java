package ch16.level;

public class Player {
	PlayerLevel level;
	
	public void upgradeLevel(PlayerLevel playerLevel){
		level = playerLevel;
	}
	
	public PlayerLevel getLevel(){
		return level;
	}
	
	public Player() {
		level = new BeginnerLevel();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
