package com.po;

/**
 * Created by QQQ on 2018/5/13.
 */

/**
 * model类的属性getter setter等要规范
 */
public class User {


	private String id;

	private String password;
	private String name;

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	private String nickname;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

}
