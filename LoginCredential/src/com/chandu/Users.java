package com.chandu;

public class Users {
	static String userName;
	static String passWord;
	
	public Users(String userName,String passWord) {
		this.userName=userName;
		this.passWord=passWord; 
	}
	public static String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public static String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
