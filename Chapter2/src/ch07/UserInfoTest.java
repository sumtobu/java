package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		
		userLee.userId = "불멸의 이순신";
		userLee.userPassWord = "immortalLee";
		userLee.userName = "이순신";
		userLee.phoneNumber = "010-9898-1234";
		userLee.userAddress = "강원도 철원";
		
		System.out.println(userLee.ShowUserInfo());
		
		UserInfo userKim = new UserInfo("정렬맨123","alignmentman123","김정렬");
		System.out.println(userKim.ShowUserInfo());
		
	}

}
