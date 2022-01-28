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
		
		FileInputStream fis = new FileInputStream("db.properties");// 파일 을 읽어옴
		
		Properties prop = new Properties();// 2개씩 묶어서 읽어옴
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");//DBTYPE과 묶여있는 데이터 읽어오기
		
		UserInfo userInfo = new UserInfo();//유저 정보 입력
		userInfo.setUserId("타락파워전사");
		userInfo.setPassword("타락@123");
		userInfo.setUserName("김근성");
		
		
		UserInfoDao userInfoDao = null; //인터페이스를 타입으로 하고 dbType 에따라 인터페이스를 다르게 넣어주기
		
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
