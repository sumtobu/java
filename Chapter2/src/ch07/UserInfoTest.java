package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		
		userLee.userId = "�Ҹ��� �̼���";
		userLee.userPassWord = "immortalLee";
		userLee.userName = "�̼���";
		userLee.phoneNumber = "010-9898-1234";
		userLee.userAddress = "������ ö��";
		
		System.out.println(userLee.ShowUserInfo());
		
		UserInfo userKim = new UserInfo("���ĸ�123","alignmentman123","������");
		System.out.println(userKim.ShowUserInfo());
		
	}

}
