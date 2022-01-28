package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");// ���� �� �о��
		
		Properties prop = new Properties();// 2���� ��� �о��
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");//DBTYPE�� �����ִ� ������ �о����
		
		UserInfo userInfo = new UserInfo();//���� ���� �Է�
		userInfo.setUserId("Ÿ���Ŀ�����");
		userInfo.setPassword("Ÿ��@123");
		userInfo.setUserName("��ټ�");
		
		
		UserInfoDao userInfoDao = null; //�������̽��� Ÿ������ �ϰ� dbType ������ �������̽��� �ٸ��� �־��ֱ�
		
		if( dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
