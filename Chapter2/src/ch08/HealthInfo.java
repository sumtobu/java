package ch08;

public class HealthInfo {
	public int height;
	public int weight;
	public String gender;
	public int age;
	public String name;
	
	public HealthInfo() {}
	
	public HealthInfo(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String ShowHealthInfo() {
		return name + "님의 키는 " + height + "이고, 몸무게는 " + weight + "입니다.";
	}
}
